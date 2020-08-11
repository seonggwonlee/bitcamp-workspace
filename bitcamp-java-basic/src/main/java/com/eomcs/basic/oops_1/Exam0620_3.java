package com.eomcs.basic.oops_1;

public class Exam0620_3 {

  static class A {
    static int a;

    static void m() {
    }

    static {
      System.out.println("Static{} 1111");
    }

    static {
      System.out.println("Static{} 2222");
    }
  }
  public static void main(String[] args) {
    A.a = 100;

    System.out.println(A.a);
  }
  // 클래스 로딩이 일어날 때
  // 1. 클래스 멤버가 최초로 사용될 때

  // A.a = 100;을 통해 클래스 멤버가 사용되었으므로 Class A가 로딩되어 static 필드가 출력된다.
}