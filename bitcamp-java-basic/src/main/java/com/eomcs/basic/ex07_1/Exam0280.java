package com.eomcs.basic.ex07_1;

public class Exam0280 {
// 메서드의 중첩 호출
  public static void main(String[] args) {
    int result = plus(2, 3);
    result = plus(result, 4);
    result = plus(result, 5);
    System.out.println(result);
    // 메서드의 리턴 값을 변수로 받을 때 하나하나 선언

    result = plus(plus(plus(2, 3), 4), 5);
    // 메서드의 리턴 값을 바로 파라미터에 전달할 때
    // 실행 순서는 가장 안쪽부터이다.

    System.out.println(result);

    System.out.printf("100 + 200 = %d\n", plus(100, 200));
  }
  static int plus(int a, int b) {
    return a + b;
  }
}
