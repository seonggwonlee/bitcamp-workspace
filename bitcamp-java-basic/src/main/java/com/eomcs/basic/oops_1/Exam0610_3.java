package com.eomcs.basic.oops_1;

public class Exam0610_3 {

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
  public static void main(String[] args) throws Exception {
    A obj1;
    A obj2; // 레퍼런스 초기화시에는 클래스가 로딩되지 않는다.

    System.out.println("종료");
  }
}
