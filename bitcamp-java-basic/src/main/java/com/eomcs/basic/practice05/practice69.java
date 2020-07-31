package com.eomcs.basic.practice05;

public class practice69 {

  public static void main(String[] args) {

    int count = 0;

    while (count < 5) System.out.println(count++);
        System.out.println("--------------------");
    // 문법1
    // while (조건) 문장
    // 조건이 참인 동안에는 문장을 계속 반복 실행한다.

        count = 0;
        while (count < 5)
          System.out.println(count++);

        System.out.println("---------------------");

        // 문법2
        // while (조건) {}
        // 조건이 참인 동안에는 문장을 계속 반복 실행한다.

        count = 0;
        while (count < 5) {
          System.out.println(count);
          count++;
        }
        // 문법3
        // while(조건) {}
        // 여러 개의 문장 반복 실행시 {}으로 묶어야 한다.
    }
}
