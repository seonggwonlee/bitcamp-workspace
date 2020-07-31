package com.eomcs.basic.practice05;

public class Exam0431 {
// for 중첩과 break

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
        if (j == 5)
          break; // 현재 소속된 반복문을 멈춘다.
      }
      System.out.println();
    }
  }
}
