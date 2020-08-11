package com.eomcs.basic.oops_1;

public class Exam0640_3 {

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
  public static void main(String[] args) {

    new A();

    System.out.println("종료");
  }
  // 클래스가 로딩될 때
  // 2. 해당 클래스의 인스턴스가 최초로 생성될 때
}
