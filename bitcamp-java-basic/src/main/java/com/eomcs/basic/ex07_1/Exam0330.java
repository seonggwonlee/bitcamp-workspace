package com.eomcs.basic.ex07_1;

public class Exam0330 {

  static class MyObject {

    int a;
    int b;

  }

  public static void main(String[] args) {
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;

    swap(ref);
    System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
  }

  static void swap(MyObject ref) {
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    int temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    }
}
