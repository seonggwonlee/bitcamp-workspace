package com.eomcs.basic.oops_1;

public class Exam0220_3 {

  static class A {
    int value;

    static void m1() {

    }

    void m2() {
      this.value = 100;
    }

    void m3() {
      value = 200;
    }// this 변수 생략

    void m4(int value) {
      value = 200;

      this.value = 300;
      // 로컬 변수의 이름이 인스턴스 변수와 같을 경우 구분을 위해 this를 붙인다.
      // 평소 인스턴수 변수는 위와 같이 this를 생략할 수 있다.
    }
  }

  public static void main(String[] args) {
    A.m1();

    A obj1 = new A();

    obj1.m2();

    obj1.m1();

    A obj2 = new A();

    obj2.m2();
    // 인스턴스 메서드의 this 변수는 메서드 호출 시 전달한 인스턴스의 주소값을 가진다.
    // 따라서 호출될 때마다 this 변수값이 바뀐다.

    System.out.printf("%d, %d, %d\n", A.m1(), obj1.m2(), obj1.m3());
  }
}
