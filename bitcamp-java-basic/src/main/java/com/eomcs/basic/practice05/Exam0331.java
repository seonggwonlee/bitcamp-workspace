package com.eomcs.basic.practice05;

public class Exam0331 {

  // 중첩된 반복문 탈출

  public static void main(String[] args) {

    int x = 2, y = 1;

    // 라벨명 : 반복문1 {반복문2 {break 라벨명;}}
    // 라벨 문법
    // 라벨 : 문장;
    // 라벨 : {문장, 문장2, ...}

    loop:
      while(x <= 9) {

        while (y <= 9) {
          System.out.printf("%d x %d = %d\n", x, y, x * y);
          if (x == 5 && y == 5)
            break loop;
          y++;
        }
        System.out.println();
        x++;
        y = 1;
      }
    System.out.println("종료");
  }

}
