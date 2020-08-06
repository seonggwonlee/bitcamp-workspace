package com.eomcs.basic.oops_1;

public class Exam0110_3 {

  public static void main(String[] args) {

    class A { // 인스턴스 변수
      // new 명령어로 Heap메모리에 인스턴스 생성해야한다.
      // new 명령 실행 전 까지는 인스턴스 변수 생성되지 않는다.

    int v1;
    boolean v2;
    }

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 3000;

    System.out.printf("%d, %d, %d\n", obj1.v1, obj2.v1, obj3.v1);
  }
}
