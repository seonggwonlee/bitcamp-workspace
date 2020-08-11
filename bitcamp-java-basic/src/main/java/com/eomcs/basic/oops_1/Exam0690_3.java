package com.eomcs.basic.oops_1;

public class Exam0690_3 {

  static class A {
    static float pi;

    static float area(int r) {
      return pi * r * r;
    }

    static {
      pi = 3.14159f;
    }
  }

  // static float pi;
  // static {
  //    pi = 3.14159
  //

  public static void main(String[] args) {
    System.out.println(A.area(25));
  }
}
