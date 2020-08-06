package com.eomcs.basic.oops_1;

public class Exam0130_3 {

  static class A {
    // 클래스 변수
    // static이 있기 때문에 스태틱 변수라고도 한다.
    // 한 클래스 당 한 개만 생성되기 때문에 여러 개의 변수 생성이 필요할 때 적합하지 않다.
    // JVM의 메모리 영역 중 'Method Area'에 생성된다.
    // 클래스 사용 순간 클래스 로딩되고 자동 생성된다.
    static int v1;
    static boolean v2;
  }

  public static void main(String[] args) {

    A.v1 = 100;
    A.v2 = true;

    System.out.printf("%d, %b\n", A.v1, A.v2);
  }
}
