package com.eomcs.basic.practice05;

public class practice72 {

  public static void main(String[] args) {

    int count = 0;
    int sum = 0;

    // 1에서 100까지 카운트하는 반복문
    // 합은 50 까지만 한다.
    while (count < 100) {
      count++;
      if (count > 50)
        continue;
      sum += count;
    }
    System.out.printf("%d, %d\n", count, sum);

    System.out.println("------------------------");

    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        break; // 즉시 반복문을 종료하고 나간다.
      sum += count;
    }
    System.out.printf("%d, %d\n", count, sum);
  }
}
