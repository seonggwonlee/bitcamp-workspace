package com.eomcs.basic.practice05;

public class Exam0340 {

  // 흐름 제어문 do ~ while문
  public static void main(String[] args) {

    int i = 0;

    do
      System.out.println(++i);
    while (i < 10);

    System.out.println("----------------");

    i = 0;
    do {
      i += 1;
      System.out.println(i);
    }  while (i < 10);
    // do {}에서 {}안에 있는 조건식을 무조건 한 번 실행 후 While을 통해 반복 여부 결정한다.
  }
}
