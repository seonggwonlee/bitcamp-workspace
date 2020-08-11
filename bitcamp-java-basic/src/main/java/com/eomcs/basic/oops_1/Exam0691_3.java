package com.eomcs.basic.oops_1;

public class Exam0691_3 {

  static class A {
    static int a = 7;

    static {
      System.out.println("A.static{}");
       a += B.b;
    }
  }

  static class B {
    static int b = 22;

    static {
      System.out.println("B.static{}");
      b += A.a;
    }
  }

  public static void main(String[] args) {
    System.out.println(A.a);
    System.out.println(B.b);
  }
}
