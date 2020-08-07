package com.eomcs.basic.oops_1;

import java.sql.Date;

public class Exam0510_3 {

  static class A {
    static byte b;
    static short s;
    static int i;
    static long l;
    static char c = 'A';
    static float f;
    static double d;
    static boolean bool;
    static String str;
    static Date date;
  }



  public static void main(String[] args) {
    System.out.printf("%d, %d, %d, %d, %c, %.1f, %.1f, %b, %s, %s\n",
        A.b, A.s, A.i, A.l, A.c, A.f, A.d, A.bool, A.str, A.date);
  }

  // 클래스 변수는 선언하는 순간 자동 초기화가 된다. (정수 0, 부동소수점 0.0, 논리 false, 레퍼런스 null)
}
