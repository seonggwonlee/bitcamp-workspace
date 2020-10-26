package com.eomcs.net_2.ex04.stateless2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long clientId = 0;

    while (true) {
      System.out.println("연산자? ");
      String op = in.nextLine();

      System.out.println("첫번째 값? ");
      int fir = Integer.parseInt(in.nextLine());

      try (Socket socket = new Socket("localhost", 8888);
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream input = new DataInputStream(socket.getInputStream())) {

        out.writeLong(clientId);

        out.writeUTF(op);
        out.writeInt(fir);
        out.flush();

        clientId = input.readLong();

        int result = input.readInt();
        System.out.printf("계산 결과 : %d\n", result);

      } catch (Exception e) {
        System.out.println("서버와 통신 중 오류 발생");
      }
      System.out.println("계속 하시겠습니까?(Y/n)");
      if (in.nextLine().equalsIgnoreCase("n")) {
        break;
      }
    }
    in.close();
  }
}
