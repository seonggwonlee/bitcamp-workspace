package com.eomcs.basic.oops_1;

public class Exam0230_3 {

  static class Calculator {
    int result; // 인스턴스 변수
    static int total;

    public void plus (int value) {
      this.result += value;
    }
    public void minus (int value) {
      this.result -= value;
    }
  }
  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(123);
    c2.minus(30);

    }
}
