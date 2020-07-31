package com.eomcs.basic.practice05;

// break와 continue의 활용
public class practice70 {

  public static void main(String[] args) {

    int count = 0;
    int sum = 0;

    while (count < 100) {
      sum += ++count;
      // count++
      // => sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
