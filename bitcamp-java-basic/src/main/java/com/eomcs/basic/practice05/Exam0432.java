package com.eomcs.basic.practice05;

public class Exam0432 {

  // for 중첩과 break

  public static void main(String[] args) {

    loop:
      for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
          if (j == 5)
            break loop;
        }
        System.out.println();
      }
    System.out.println("\n----------------");

    // loop라벨을 for문 제일 바깥에다가 선언
    // 제일 안 쪽 for문에서 break를 loop라벨 통해 수행한다.
    // for문 자체를 종료한다.
  }
}
