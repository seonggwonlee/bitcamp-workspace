package com.eomcs.corelib.ex02_1;

public class Exam0113 {
  public static void main(String[] args) {
    String s1 = new String("Hello");

    String s2 = s1.intern();
    String s3 = "Hello";
    // intern
    // 지정된 String 객체를 상수풀에서 찾는다.
    // 찾아서 있다면 해당 객체의 주소를 리턴한다.
    // 없다면 상수풀 String 객체 생성 후 그 주소 리턴한다.

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
  }
}
