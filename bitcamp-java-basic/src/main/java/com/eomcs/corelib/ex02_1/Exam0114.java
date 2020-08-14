package com.eomcs.corelib.ex02_1;

public class Exam0114 {
  public static void main(String[] args) {
    String s1 = new String("Hello");

    String s2 = "Hello";
    // 상수풀에 String 객체 생성

    String s3 = s1.intern();

    System.out.println(s3 == s1);
    System.out.println(s1 == s3);
    System.out.println(s1 == s2);
    System.out.println(s3.equals(s1));
  }
}
