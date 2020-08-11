package com.eomcs.basic.oops_1;

public class Exam0660_3 {
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

  // 클래스가 로딩될 때 정리
  // 1. 클래스 멤버(변수와 메서드)가 최초로 사용될 때(클래스 멤버가 사용 전 클래스가 로딩되어있지 않을 때)
  // => A.a = 100; / A.m();
  // 2. 해당 클래스의 인스턴스를 생성할 동안 클래스가 로딩되어있지 않을 때
  // => new A();
  // 3. 자바에서 제공하는 도구를 이용해 해당 클래스를 실행할 동안 클래스가 로딩되어있지 않을 때
  // => Class.forName("~~~~~");

  // 클래스가 로딩된 후
  // 클래스 필드 생성 => 클래스 블록 실행 (스태틱 블록)

  // 레퍼런스 선언 시 클래스 로딩되지 않으며 중복으로 로딩되지도 않는다.
  A.a = 100;
  System.out.println("------");
  new A(); // 위에서 클래스 멤버 사용하여 로딩했기 때문에 여기서 다시 로딩하지 않는다.
  }
}
