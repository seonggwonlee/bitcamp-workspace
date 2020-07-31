package com.eomcs.basic.practice05;

public class Exam0420 {

  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++)
      System.out.println(i);

    // for문 안에서 선언된 변수는 블록 밖으로 나가는 순간 제거된다.

//    System.out.println(i);
    // 그래서 위와 같이 i 변수의 값을 조회하면 컴파일 오류 발생한다.

    System.out.printf("-----------------");

    int x;
    for (x = 1; x <= 5; x++)
      System.out.println(x);

    System.out.printf("x = %d\n", x);

    // for 문 종료후에도 해당 변수를 사용하고 싶다면
    // for 문 블록 밖에서 변수를 선언한다.
  }
}
