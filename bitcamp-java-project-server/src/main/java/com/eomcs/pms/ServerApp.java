package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.pms.listener.RequestMappingListener;

public class ServerApp {

  // 클라이언트가 "stop"명령을 하면 이 값이 true로 변경됨
  // 이 값이 true이면 다음 클라이언트가 접속시 서버를 종료한다.
  static boolean stop = false;

  // 옵저버와 공유할 맵 객체
  static Map<String,Object> context = new Hashtable<>();

  // 옵저버를 보관할 컬렉션 객체
  List<ApplicationContextListener> listeners = new ArrayList<>();

  // 옵저버를 등록하는 메서드
  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  // 옵저버를 제거하는 메서드
  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }

  // 옵저버에게 통지한다.
  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }
  }

  // 옵저버에게 통지한다.
  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }

  public void service(int port) {

    notifyApplicationContextListenerOnServiceStarted();

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("서버 실행 중...");

      while (true) {
        Socket clientSocket = serverSocket.accept();
        // 람다 문법 사용

        if (stop) {
          break;
        }

        new Thread(() -> handleClient(clientSocket)).start();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    notifyApplicationContextListenerOnServiceStopped();
  }

  public static void main(String[] args) {
    ServerApp server = new ServerApp();

    server.addApplicationContextListener(new AppInitListener());
    server.addApplicationContextListener(new DataHandlerListener());
    server.addApplicationContextListener(new RequestMappingListener());

    server.service(8888);
  }

  private static void handleClient(Socket clientSocket) {
    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n",
        address.getHostAddress());

    try (Socket socket = clientSocket; // try 블록을 떠날 때 close()가 자동 호출된다.
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream())) {

      while (true) {
        String request = in.readLine();

        Command command = (Command) context.get(request);
        if (command != null) {
          command.execute();
        } else {
        sendResponse(out, "해당 명령을 찾을 수 없습니다.");
        }

        if (request.equalsIgnoreCase("quit"))
          break;
        else if (request.equalsIgnoreCase("stop")) {
          stop = true; // 서버의 상태를 멈추라는 의미의 True로 설정한다
          break;
        }
      }

    } catch (Exception e) {
      System.out.println("클라이언트와의 통신 오류!");
    }
    System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n",
        address.getHostAddress());
  }

  private static void sendResponse(PrintWriter out, String message) {
    out.println(message);
    out.println(); // 응답이 끝났음을 알리는 빈 줄을 보낸다.
    out.flush();
  }
}