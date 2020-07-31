package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    class App1 {

      int no;
      String name;
      String email;
      String password;
      String photo;
      String call;
      Date now;

    }

    Scanner KeyInput = new Scanner(System.in);

    final int LENGTH = 100;
    App1[] app = new App1[LENGTH];

    int count = 0;

    System.out.println("[회원]");

    for (int i = 0; i <= LENGTH; i++) {
      count++;

      App1 a = new App1();

    System.out.print("번호? ");
    a.no = KeyInput.nextInt();
    KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다.
    //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언

    System.out.print("이름? ");
    a.name = KeyInput.nextLine();

    System.out.print("이메일? ");
    a.email = KeyInput.nextLine();

    System.out.print("암호? ");
    a.password = KeyInput.nextLine();

    System.out.print("사진? ");
    a.photo = KeyInput.nextLine();

    System.out.print("전화? ");
    a.call = KeyInput.nextLine();

    long currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
    a.now = new Date(currentMillis);

    app[i] = a;

    System.out.println("");

    System.out.println("계속 입력하시겠습니까? (y/N) ");
    String response = KeyInput.nextLine();

    if (!response.equalsIgnoreCase("y"))
      break;
    }

    KeyInput.close();

    System.out.println("-------------------------------");
    for (int i = 0; i < count; i++) {
      App1 a = app[i];
      System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n",
          a.no, a.name, a.email, a.password, a.photo, a.call, a.now.toString());
    }
  }
}
