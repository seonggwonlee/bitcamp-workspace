package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {

      try (ServerSocket ss = new ServerSocket(8888)) {
        System.out.println("서버 생성");

        try (Socket socket = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          System.out.println("클라이언트와 연결됨");

          String str = in.readLine();

          out.println(str);
          out.flush();

        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
