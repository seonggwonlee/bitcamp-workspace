package com.eomcs.basic.oop.ex03;

public class Exam0210 {

  static class A {

    static int v1;
    int v2;

    static void m1() {
      System.out.println("m1()");
      A.v1 = 100;
//      v1 = 200; // 같은 스태틱 멤버이기 때문에 생략 가능
      //      this.v2 = 200;
      // 스태틱 메서드는 this라는 내장 변수가 없다.
      // 따라서 this를 사용하여 접근하는 인스턴스 멤버(필드, 메서드)를 사용할 수 없다.
    }
    void m2() {
      System.out.println("m2()"); // 인스턴스 필드 쓰지 않는 거라면 선언하지 말아야 함.
      this.v2 = 100;

      // 인스턴스 필드에 접근하려면
      // 메서드 내장 변수인 this를 사용하라
      // this는 메서드가 호출될 때 외부로부터 받은 인스턴스 주소를 갖고 있다.

      v2 = 300; // 코드 작성할 때 this를 생략할 수 있다.

      // 스태틱 필드는 인스턴스 레퍼런스를 통해 접근할 수 있다. - 비권장
      this.v1 = 100;

      // 물론 다음과 같이 클래스 이름을 생략할 수 있다. - 반반
      v1 = 200;
      A.v1 = 200;
      m1(0);
      A.m1(!);
    }

    static int abs(int value) {
      if (value < 0) {
        return value * -1;
      } else {
        return value;
     }
    }
   }

  public static void main(String[] args) {
    A.m1();
    //A.m2();
    // 인스턴스가 있어야만 호출 가능

    A obj1 = new A();
    obj1.m2();
    obj1.m1(); // 컴파일 가능하나 바람직하지 않은 문법

    System.out.println(A.abs(100));
    System.out.println(A.abs(-100));
    System.out.println(Math.abs(-100));
  }
}00
