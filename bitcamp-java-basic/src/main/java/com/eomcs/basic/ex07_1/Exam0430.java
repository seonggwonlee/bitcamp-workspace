package com.eomcs.basic.ex07_1;

public class Exam0430 {

  // 인스턴스와 Heap 메모리 영역

  static class MyObject {

    int a;
    int b;

  }
  static MyObject getMyObject() {
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;

    return ref;

  }
  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject();
    System.out.println(ref.a);
    System.out.println(ref.b);
  }
}
