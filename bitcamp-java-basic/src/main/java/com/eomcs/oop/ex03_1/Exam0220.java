package com.eomcs.oop.ex03_1;

// 내장변수 this
public class Exam0220 {
  static class A {
    int value;

    static void m1() {
      // 클래스 메서드는 인스턴스 주소 없이 호출되기 때문에
      // 인스턴스 주소를 받을 수 있는 따로 내장된 변수가 존재하지 않는다.
    }

    void m2() {
      this.value = 100;
      // 인스턴스 메서드는 인스턴스 주소가 있어야지만 호출이 되기 때문에
      // 인스턴스 주소를 받을 수 있는 변수가 따로 내장되어 있다.
    }

    void m3() {
      value = 200;
      // 인스턴스 변수 사용시 this는 생략 가능하다.
    }

    void m4(int value) {
      value = 300;
      // 로컬 변수의 이름이 인스턴스 변수의 이름과 같다면
      // this가 붙지 않으면 로컬 변수를 가리킨다.
      this.value = 400;
      // this가 붙으면 인스턴스 변수를 가리킨다.
    }
  }

  public static void main(String[] args) {
    A.m1();
    // 클래스 메서드는 인스턴스 주소 없이 클래스 이름만으로 호출 가능하다.
    // 따라서 this 내장 변수는 없다.

    A obj1 = new A();

    obj1.m2();
    System.out.println(obj1.value);
    // 인스턴스 메서드는 인스턴스 주소가 있어야지만 호출 가능하기 때문에
    // 인스턴스 메서드에는 인스턴스 주소를 받을 수 있는 내장 변수 this가 있다.

    A obj2 = new A();
    obj2.m2();
    // 인스턴스 메서드의 this 변수는 메서드 호출 시 전달한 인스턴스 주소의 값을 가진다.
    // 따라서 메서드 호출시마다 this 변수의 값이 바뀐다.
  }
}
