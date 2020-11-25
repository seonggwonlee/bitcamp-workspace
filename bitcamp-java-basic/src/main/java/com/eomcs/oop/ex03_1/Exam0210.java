package com.eomcs.oop.ex03_1;

// 인스턴스 메서드와 클래스 메서드
public class Exam0210 {
  static class A {
    static void m1() {
      System.out.println("m1()");
      // 클래스 메서드
      // static이 붙은 메서드이다.
    }

    void m2() {
      System.out.println("m2()");
      // 인스턴스 메서드
      // static이 붙지 않은 메서드이다.
      // 인스턴스 주소가 있어야지만 호출할 수 있다.
    }
  }

  public static void main(String[] args) {
    A.m1(); // 클래스 메서드 호출

    A obj = new A();

    obj.m2();
    // 인스턴스 메서드 호출

    // 클래스 메서드를 인스턴스 메서드 호출하듯이 할 수 있지만 혼란을 일으킬 수 있기 때문ㅇ
    // 클래스 메서드는 클래스 이름으로 직접 호출하고
    // 인스턴스 메서드는 인스턴스 선언 후 인스턴스 변수를 통해 호출하는 것이 좋다.
    // 인스턴스 선언 시 null 선언해도 인스턴스 메서드 호출은 가능하나
    // 주소가 유효하지 않기 때문에 실행 오류가 출력된다.
  }
}
