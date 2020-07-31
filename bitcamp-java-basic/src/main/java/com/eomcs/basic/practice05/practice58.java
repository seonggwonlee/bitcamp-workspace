package com.eomcs.basic.practice05;

import java.util.Scanner;

public class practice58 {

  public static void main (String[] args) {

    Scanner keyScan = new Scanner(System.in);
    System.out.print("나이를 입력하세요 :");
    int age = keyScan.nextInt();

    if (age < 8)
      System.out.println("아동");
      else if (age < 14)
          System.out.println("어린이");
      else if (age < 19)
          System.out.println("청소년");
      else if (age < 65)
          System.out.println("성인");
      else
          System.out.println("노인");

    // 위와 같이 if ~ else 조건문을 정리하여 기입할 수 있다.
    // 자바에서는 else if 라는 문법은 없다. 단지 정리만 했을 뿐이다.
  }
}
