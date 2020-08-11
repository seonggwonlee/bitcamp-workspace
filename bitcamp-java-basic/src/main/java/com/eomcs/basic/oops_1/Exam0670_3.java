package com.eomcs.basic.oops_1;

public class Exam0670_3 {

  static class A {
    static int a = 100;


    // static int a;

    // static {
    //  a = 100;
    // }

  }
  public static void main(String[] args) {
    System.out.println(A.a);
  }
  // 변수 초기화 시 스태틱 초기화 블록이 없으면 컴파일러는 자동 생성한다.
}
