package com.eomcs.basic.oops_1;

public class Exam0710_3 {

  static class A {
    int a;
    int b;
    int c;

    {
      a = 100;
      System.out.println("Hello");
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
  }
}
