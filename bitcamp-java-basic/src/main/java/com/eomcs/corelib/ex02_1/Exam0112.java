package com.eomcs.corelib.ex02_1;

public class Exam0112 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = "Hello";

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(s1 instanceof String);
    System.out.println(s2 instanceof String);
  }
}
