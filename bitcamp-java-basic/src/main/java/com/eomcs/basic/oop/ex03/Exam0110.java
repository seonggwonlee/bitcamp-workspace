package com.eomcs.basic.oop.ex03;

public class Exam0110 {

  public static void main(String[] args) {
    // 인스턴스 변수
    class A {
      int v1;
      boolean v2; // static이 붙지 않은 변수는 인스턴스 변수 -> Heap 메모리에 저장
    }
    // instance field = non-static variable이 정확한 표기법

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);
  }
}
