package com.eomcs.basic.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210 {

  public static void main(String[] args) {
    // 현 예제에선 연산자 우선순위는 배제한다.
    //  2 + 3 - 1 * 7 / 3 = ?

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    c2.plus(4);
    c2.plus(6);
    c2.minus(2);
    c2.multiple(34);
    c2.divide(4);

    printResult(c1.result, c2.result);

  }

  static void printResult (int value, int value2) {
    System.out.printf("c1의 연산 결과 : %d\n", value);
    System.out.printf("c2의 연산 결과 : %d\n", value2);
  }
}
