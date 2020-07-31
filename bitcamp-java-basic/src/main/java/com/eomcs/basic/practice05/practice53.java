package com.eomcs.basic.practice05;

public class practice53 {

  public static void main(String[] args) {

    int age = 17;

    if (age < 19)
      System.out.println("미성년입니다.");
    // if문은 else문 없이 단독으로 사용 가능하다.

    if (age >= 19)
      System.out.println("성인입니다.");
    else
      System.out.println("미성년입니다.");
    // 조건이 거짓이면 else문을 실행한다.


    if (age >= 20) {
      System.out.println("------------");
      System.out.println("성인입니다.");
    } else {
      System.out.println("------------");
      System.out.println("미성년입니다.");
    }
    // 여러 문장 실행시 {}로 묶어야 한다.

    if (age >= 19)
      System.out.println("성인입니다.");
    else {
      System.out.println("미성년입니다.");
      System.out.println("--------------");

      // 주의
      // else 문만 사용할 수 없다.
      // if문과 else문 사이에 독립된 다른 문장이 올 수 없다.
    }
  }
}
