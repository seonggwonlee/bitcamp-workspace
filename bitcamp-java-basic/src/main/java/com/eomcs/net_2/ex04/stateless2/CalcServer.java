package com.eomcs.net_2.ex04.stateless2;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import com.eomcs.io.ex08.DataOutputStream;

public class CalcServer {

  static Map<Long, Integer> resultMap = new HashMap<>();

  public static void main(String[] args) {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 소켓 생성 후 실행 중...");

    while (true) {
      Socket socket = ss.accept();
      System.out.println("클라이언트 요청 처리");
      try {
        processRequest(socket);
      } catch (Exception e) {
        System.out.println("클라이언트 요청 처리 중 오류 발생");
        System.out.println("다음 클라이언트의 요청을 처리합니다.");
      }
    }
  }

  static void processRequest(Socket socket) throws Exception {
      try (Socket socket2 = socket;
          DataInputStream in = new DataInputStream(socket2.getInputStream());
          DataOutputStream out = new DataOutputStream(socket2.getOutputStream());) {

        long clientId = in.readLong();

        String op = in.readUTF();
        int fir = in.readInt();

        Integer obj = resultMap.get(clientId);
        // clientId가 없다면 null값을 리턴한다.
        int result = 0;

        if (obj != null) {
          System.out.printf("%d 기존 고객 요청 처리\n", clientId);
          result = obj;
        } else {
          clientId = System.currentTimeMillis();
          System.out.printf("%d 신규 고객 요청 처리\n", clientId);

          switch (op) {
            case "+": result += fir;
            break;

            case "-": result -= fir;
            break;

            case "*": result *= fir;
            break;

            case "/": result /= fir;
            break;
          }

          out.writeLong(clientId);

          out.writeInt(result);
          out.flush();

          resultMap.put(clientId, result);
        }
      }
  }
}
