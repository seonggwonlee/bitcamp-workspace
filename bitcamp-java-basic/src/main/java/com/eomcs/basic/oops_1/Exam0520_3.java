package com.eomcs.basic.oops_1;

import java.util.Date;

public class Exam0520_3 {
   static class A {
    byte b2;
    short s2;
    int i2;
    long l2;
    char c2 = 'A';
    float f2;
    double d2;
    boolean bool2;
    String str2;

    Date date2;
  }

  public static void main(String[] args) {
    A obj1 = new A();

    System.out.printf("%d, %d, %d, %d, %c, %.1f, %.1f, %b, %s, %s\n",
        obj1.b2, obj1.s2, obj1.i2, obj1.l2, obj1.c2, obj1.f2, obj1.d2, obj1.bool2, obj1.str2, obj1.date2);
  }
  // Heap에 생성되는 인스턴스 변수도 자동 초기화 된다.
}
