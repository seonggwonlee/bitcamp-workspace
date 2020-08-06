package com.eomcs.basic.oops_1;

public class Exam0140_3 {


  static class A {

    static int v1;
    int v2;

  }

  public static void main(String[] args) {
    A.v1 = 100; // 스태틱 변수 호출

    A obj1 = new A();
    A obj2 = new A();
    // v2는 인스턴스 필드이기 때문에 new명령어로 Heap에 인스턴스 생성 후 사용하여야한다.
    // A 클래스의 인스턴스를 가리키는 레퍼런스 변수 생성하였다.
    // non-static 변수를 사용하기 위해서는 레퍼런스 변수를 사용하여야 한다.
    // 클래스 이름으로는 사용할 수 없다.
    // 레퍼런스 변수는 위와 같이 여러 개 생성할 수 있다.

    obj1.v2 = 200;
    obj2.v2 = 100;

    System.out.printf("%d, %d, %d\n", A.v1, obj1.v2, obj2.v2);
  }
}
