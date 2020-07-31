package com.eomcs.basic.practice05;

import java.util.Scanner;

public class practice60 {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);
    System.out.println("지원부서");
    System.out.println("1. S/W 개발");
    System.out.println("2. 일반관리");
    System.out.println("3. 시설경비");

    System.out.print("지원 분야의 번호를 입력하여주십시오 :");
    int no = keyScan.nextInt();

    System.out.println("제출하실 서류는 아래와 같습니다.");

    switch (no) {

      case (1) :
        System.out.println("정보처리자격증");
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;

      case (2) :
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;

      case (3) :
        System.out.println("이력서");
        break;

      default :
        System.out.println("잘못된 입력입니다.");
    }
    keyScan.close();
  }
}
