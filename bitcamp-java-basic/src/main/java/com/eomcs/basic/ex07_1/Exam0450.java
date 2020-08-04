package com.eomcs.basic.ex07_1;

public class Exam0450 {
// 재귀호출

  static int sum(int value) {
    if (value == 1)
      return 1;

    return value + sum(value - 1);

  }
  public static void main(String[] args) {
    System.out.println(sum(5));
    }
  // 작은 수를 계산할 때 재귀호출을 사용하는 것이 간결하고 직관적이다.
}
