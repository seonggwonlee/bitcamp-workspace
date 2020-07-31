package com.eomcs.basic.practice05;

public class Exam0421 {

  public static void main(String[] args) {

    for (int i = 1, j = 3, k = 5; i <= 10; i++, j--, k += 2)
      System.out.printf("(%d,%d,%d) ", i, j, k);

    System.out.println();

    // 여러 개의 변수를 선언할 수 있다.
    // 또한 변수 증감문에 여러 개의 문장을 작성할 수 있다.
  }
}
