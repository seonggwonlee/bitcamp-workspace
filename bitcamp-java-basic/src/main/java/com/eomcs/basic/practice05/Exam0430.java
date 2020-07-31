package com.eomcs.basic.practice05;

public class Exam0430 {

  public static void main(String[] args) {

    for(int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
        if (j == 5)
          break;

      }
      if (i == 5)
        break;
      System.out.println();

    }
  }
}
