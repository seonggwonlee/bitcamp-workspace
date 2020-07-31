package com.eomcs.basic.practice05;

// break와 Continue의 활용
public class practice71 {

  public static void main(String[] args) {

    int count = 0;
    int sum = 0;

    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("-----------------");

    // countinue사용 전

    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1)
        continue; // 다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다.
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
