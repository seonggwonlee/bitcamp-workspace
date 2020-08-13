package com.eomcs.corelib.ex01_1;

public class Exam0134 {

  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    // String 클래스에서 equals를 오버라이딩 했다.(Object클래스에서의 equals는 인스턴스의 비교)

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));

  }
}
