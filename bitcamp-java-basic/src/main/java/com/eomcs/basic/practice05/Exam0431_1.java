package com.eomcs.basic.practice05;

public class Exam0431_1 {

  public static void main(String[] args) {
    // break문 이용

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++ ) {
        System.out.print(j + " ");
          if (j == 5)
            break;
      }
      System.out.println();
    }

  }
}
