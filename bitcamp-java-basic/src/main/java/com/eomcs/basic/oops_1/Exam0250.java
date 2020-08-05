package com.eomcs.basic.oops_1;

import com.eomcs.util.Calculator;

public class Exam0250 {

  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    Calculator c3 = new Calculator();
    // c1과 c2라는 Calculator 인스턴스 변수(주소값)를 가리키는 레퍼런스 변수를 선언한다.

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    c2.plus(4);
    c2.plus(1);
    c2.minus(3);
    c2.multiple(55);
    c2.divide(2);

    c3.plus(11);
    c3.plus(333);
    c3.minus(44);
    c3.multiple(11192);
    c3.divide(34);

    // 계산식 2개 이상을 한꺼번에 돌리기 위해 인스턴스 변수로 선언된 Calculator 클래스를 참조한다.

    System.out.printf("결과 : %d\n", c1.result);
    System.out.printf("결과 : %d\n", c2.result);
    System.out.printf("결과 : %d\n", c3.result);

  }
}
