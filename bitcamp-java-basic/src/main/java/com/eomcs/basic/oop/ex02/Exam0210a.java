package com.eomcs.basic.oop.ex02;

public class Exam0210a {

  public static void main(String[] args) {
    // 현 예제에선 연산자 우선순위는 배제한다.
    //  2 + 3 - 1 * 7 / 3 = ?
    int result = 0;

    int a = 2;
    int b = 3;

    int sum = a + b;
    int minus = sum - 1;
    int multiple = minus * 7;
    int divide = multiple / 3;

    System.out.println(divide);
  }
}
