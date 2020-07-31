package com.eomcs.basic.practice05;

public class Exam0330 {
  // 중첩된 반복문 탈출

  public static void main (String[] args) {

    int x = 2, y = 1;

    while (x <= 9) {

      while (y <= 9) {
        System.out.printf("%d x %d = %d\n", x, y, x * y);
        if (x == 5 && y == 5)
          break; // 자신이 소속된 가장 가까운 반복문을 나간다.
        y++;
      }

      System.out.println();
      x++;
      y = 1;
    }
    System.out.println("종료");
  }
}
