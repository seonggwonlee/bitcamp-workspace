package com.eomcs.basic.oops_1;

import java.util.Scanner;

public class Exam0310_3 {

  static class Math {

    public static int abs(int value) {
      if (value < 0)
          return value * -1;
        return value;
    }
  }
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int value = keyInput.nextInt();

    int result = Math.abs(value);

    System.out.printf("절대값 = %d\n", result);
  }
}
