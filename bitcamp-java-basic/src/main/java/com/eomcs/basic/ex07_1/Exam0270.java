package com.eomcs.basic.ex07_1;

public class Exam0270 {

  public static void main(String[] args) {
    m2(10, 20, "안녕","안녕","안녕","안녕","안녕","안녕");
  }
  static void m2(int a, int b, String...names) {
    System.out.println(a);
    System.out.println(b);
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
