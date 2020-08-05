package com.eomcs.basic.oops_1;

public class Exam0220 {

  static class Calculator { // 계산 기능과 관련된 메서드를 별도의 블록으로 관리한다 => 클래스 문법
    static int plus(int a, int b) {
      return a + b;
    }
    static int minus(int a, int b) {
      return a - b;
    }
    static int multiple(int a, int b) {
      return a * b;
    }
    static int divide(int a, int b) {
      return a / b;
    }
  }
  public static void main(String[] args) {
    int result = 0;

    result = Calculator.plus(2, 3);
    result = Calculator.minus(result, 1);
    result = Calculator.plus(result, 3);
    result = Calculator.plus(result, 3);

  }
}
