package com.eomcs.basic.oops_1;

public class Exam0630_3 {

  static class A {
    static int a;

    static void m() {
      System.out.println("m()...");
    }

    // 클래스가 로딩될 때 스태틱 초기화 블록 실행된다.
    // 스태틱 블록이 여러 개일 때 컴파일러는 1개로 합친다.

    static {
      System.out.println("Static{} 111111");
    }

    static {
      System.out.println("Static{} 222222");
    }
  }

  public static void main(String[] args) {

    A.m();
    System.out.println("종료");
  }
}
