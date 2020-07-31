package com.eomcs.basic.practice05;

public class practice51 {

  public static void main(String[] args) {

    int age = 17;

    if (age >= 19)
      System.out.println("성인이다.");
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");

      System.out.println("----------------------");

    if (age >= 19) {
      System.out.println("성인이다.");
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");
    }

    // if 조건이 참일 경우 여러 개의 문장을 실행하고 싶다면
    // {}로 묶어서 사용해야한다.
    // {}로 묶지 않고 사용할 경우 첫번째 문장 (;로 끝나는)만 실행된다.
    // 들여쓰기는 문법에 해당되지 않고 코드를 보기 쉽게 정리하는 역할이다.
  }
}
