package com.eomcs.oop.ex03_1;

// 인스턴스와 인스턴스 변수, 메서드
public class Exam0230 {
  static class Calculator {
    int result;

    public void plus (int value) {
      this.result = result + value;
    }

    public void minus (int value) {
      this.result = result - value;
    }
  }

  public static void main(String[] args) {
    Calculator excute = new Calculator();

    excute.plus(100);
    excute.minus(200);

  }
}
