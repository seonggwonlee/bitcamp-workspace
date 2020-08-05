package com.eomcs.basic.oops_1;

public class Exam0230 {

  static class Calculator {

    static int result = 0;

    static void plus(int value) { // 리턴이 필요없기 때문에 void로 바꾼다.
      result += value;
    }
    static void minus(int value) {
      result -= value;
    }
    static void multiple(int value) {
      result *= value;
    }
    static void divide(int value) {
      result /= value;
    }
    // 계산과 관련된 메서드를 별도 블록으로 관리하는 클래스이기 때문에
    // result 값 역시 class 안에 둬야 한다.
    // result 값을 통해 Calculator 클래스 안에서 전부 계산한다.


  }
  public static void main(String[] args) {

    Calculator.plus(2);
    Calculator.plus(3); // plus가 두 개인 이유는 Calculator 클래스의 result 초기값이 0이기 때문이다.
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    // Exam0230에 메인 메서드에선 Calculator 클래스를 참조한다.

    System.out.printf("결과 : %d\n", Calculator.result);

  }
}
