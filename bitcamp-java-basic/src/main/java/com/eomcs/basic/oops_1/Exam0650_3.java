package com.eomcs.basic.oops_1;

public class Exam0650_3 {

  static class A {
    static int a;

    static void m() {

    }

    static {
      System.out.println("Static{} 111111");
    }

    static {
      System.out.println("Static{} 222222");
    }
  }

  public static void main(String[] args) throws Exception {
    Class.forName("com.eomcs.basic.oops_1.Exam0650_3$A");

    System.out.println("종료");
  }
  // 클래스가 로딩될 때
  // 자바에서 제공하는 도구 사용하여 클래스 로딩할 때
  // 이미 클래스가 로딩되어 있다면 다시 로딩하지 않는다.
}
