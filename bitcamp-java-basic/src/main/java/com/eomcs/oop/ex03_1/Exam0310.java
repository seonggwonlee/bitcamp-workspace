package com.eomcs.oop.ex03_1;

import java.util.Scanner;

public class Exam0310 {
  static class Math {
    public static int abs(int value) {
      if (value < 0)
        return value * -1;
        return value;
        // 인스턴스 변수 사용하지 않고
        // 파라미터 값을 가지고 작업하는 경우에 보통 클래스 메서드로 정의한다.
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    int value = in.nextInt();

    int result = Math.abs(value);
    // 특정 인스턴스의 변수가 아니라
    // 외부에서 전달한 파라미터 값을 가지고 작업을 수행하는 메서드인 경우
    // 클래스 메서드로 정의하면 사용하기 편하다.

    System.out.printf("절대값=%d\n", result);
  }
}
