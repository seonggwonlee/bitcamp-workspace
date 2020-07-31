package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.


// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는 메모리 설계한다.
//    => Member 클래스 정의
// 2) Member 클래스의 레퍼런스 배열을 만들어 Member의 인스턴스를 보관한다.
// 3) 레퍼런스 배열을 사용하여 인스턴스를 다루기 보다는 낱개의 레퍼런스를 만들어
//    인스턴스를 다루는 것이 더 간편하다


public class App {

  public static void main(String[] args) {
    class Member { // class 선언시 대문자로 선언

      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date createdDate;

    }

    Scanner KeyInput = new Scanner(System.in);

    final int LENGTH = 100;
    // Member인스턴스의 주소를 담을 레퍼런스 배열 준비
    Member[] members = new Member[LENGTH]; // [ , , , , ] 5개의 레퍼런스 준비

    int count = 0;
    long currentMillis = 0;

    for (int i=0; i < LENGTH; i++) {
      count++;

      Member m = new Member();

      System.out.print("번호? ");
      m.no = KeyInput.nextInt(); // 위치를 가리킬 때는 0부터
      KeyInput.nextLine();

      System.out.print("이름? ");
      m.name = KeyInput.nextLine();

      System.out.print("이메일? ");
      m.email = KeyInput.nextLine();

      System.out.print("암호? ");
      m.password = KeyInput.nextLine();

      System.out.print("사진? ");
      m.photo = KeyInput.nextLine();

      System.out.print("전화? ");
      m.tel = KeyInput.nextLine();

      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
      m.createdDate = new Date(currentMillis);

      System.out.println(); // 빈 줄(엔터효과)

      members[i] = m;

      System.out.print("계속 입력하시겠습니까? (y/N) ");
      String response = KeyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문 중
      }

    }


    KeyInput.close();

    System.out.println("-------------------------------");

    for (int i = 0; i < count; i++) {
      Member m = members[i];
      System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s\n",
          m.no, m.name, m.email, m.tel, m.createdDate.toString());
    }
  }
}
