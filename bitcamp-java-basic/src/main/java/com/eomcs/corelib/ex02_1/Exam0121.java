package com.eomcs.corelib.ex02_1;

public class Exam0121 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("HELLO");

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 구별 없이
  }
}
