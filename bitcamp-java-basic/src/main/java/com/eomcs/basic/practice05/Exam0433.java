package com.eomcs.basic.practice05;

public class Exam0433 {

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 0)
          continue;
        System.out.print(j + " ");
      }
      System.out.println();

      // continue를 통해 그 밑에 문장을 실행하지 않고
      // 다시 위에 있는 조건문을 반복 실행한다.
      // 해당 코드는 짝수를 출력하지 않는 것이다.

    }
  }

}
