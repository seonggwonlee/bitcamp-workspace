package com.eomcs.basic.oops_1;

public class Exam0210_3 {

  static class A {

    static void m1() {
      System.out.println("m1()");
    }

    void m2() {
      System.out.println("m2()");
    }
  }

  public static void main(String[] args) {

    A.m1();

    A obj1 = new A();
    obj1.m1();
    // 인스턴스 필드 생성하여 레퍼런스 변수 선언 후 해당 레퍼런스 변수로 클래스 변수 호출 가능은 하지만 옳지 못 하다.
    // 왜냐하면 유지보수 시 다른 개발자가 인스턴스 메서드로 혼동할 수 있기 때문이다.
    obj1.m2();

    A obj2 = null;
    obj2.m2();
    // 컴파일 오류가 출력되진 않으나, 해당 인스턴스 주소를 가리키는 레퍼런스 변수가 null값이므로 무효하다.
  }
}
