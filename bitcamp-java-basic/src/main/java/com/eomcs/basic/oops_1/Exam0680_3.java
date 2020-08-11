package com.eomcs.basic.oops_1;

public class Exam0680_3 {

  static class A {
    static int a = 100;

    static {
      a = 200;
      System.out.println("Static{} 실행");
    }

    static {
      b = 400;
    }

    static int b = 300;
  }
  // 위 문장은 다음과 같이 변경된다.
  // static int a;
  // static int b;
  // static {
  //    a = 100;
  //    a = 200;
  //    System.out.println("Static{} 실행");
  //    b = 400;
  //    b = 300;

  public static void main(String[] args) {

    System.out.println(A.a);
    System.out.println(A.b);
  }

  // 변수 초기화 문장 컴파일 시
  // 1. 모든 스태틱 변수에 대한 필드를 생성한다.
  // 2. 스태틱 변수 초기화 문장을 스태틱 블록으로 변경 후 모든 블록을 순서대로 합친다.
  // ==> 모든 스태틱 블록 및 초기화 문장을 선언 순서대로 하나의 블록으로 합친다.
}
