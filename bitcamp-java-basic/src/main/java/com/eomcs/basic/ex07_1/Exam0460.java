package com.eomcs.basic.ex07_1;

public class Exam0460 {


  static int sum(int value) {
    if (value == 1)
      return 1;

    return value + sum(value - 1);
  }
  public static void main(String[] args) {
    System.out.println(sum(100000));
  }

  // 큰 수를 계산할 때 재귀호출 사용시 스택메모리에 쌓이는 값이 많아지기 때문에
  // StackOverFlow가 발생할 수 있다.
  // 따라서 호출 단계가 많은 수일수록 반복문을 쓰는 것이 옳다.

}
