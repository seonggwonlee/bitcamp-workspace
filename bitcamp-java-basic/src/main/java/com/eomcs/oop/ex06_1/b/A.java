package com.eomcs.oop.ex06_1.b;

public class A {
  static public void m() {
    System.out.println("m()");
  }

  static public void m(int a) {
    System.out.println("m(int)");
  }

  static public void m(String a) {
    System.out.println("m(String)");
  }

  static public void m(String a, int b) {
    System.out.println("m(String, int)");
  }

  static public void m(int a, String b) {
    System.out.println("m(int, String)");
  }

//  static public void m(int a, String b) {
//    return 0;
//  } 바로 위 메서드와 리턴 타입만 다르기 때문에 불가능

//  static public void m(int c, String d) {
//    System.out.println("m(int, String)");
//  } ==> 바로 위 메서드와 변수 이름만 다르기 때문에 불가능

  // 파라미터 타입과 개수를 달리하면 메서드의 이름이 같아도 여러 개 생성 가능하다.
  // 그러나 파라미터 변수의 이름만 달리하거나 리턴 타입만 달리하는 경우에는 불가능 하다.
}
