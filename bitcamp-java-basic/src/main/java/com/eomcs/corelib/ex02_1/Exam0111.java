package com.eomcs.corelib.ex02_1;

public class Exam0111 {
  public static void main(String[] args) {
    String x1 = "Hello";
    String x2 = "Hello";

    System.out.println(x1.equals(x2));
    System.out.println(x1 == x2);

    // String 상수풀 (String Constant Pool) 영역에 String 인스턴스를 생성한다.
    // 내용물을 비교하여 동일하면 기존 인스턴스 주소를 리턴한다. => 메모리 절약
    // JVM이 끝날 때 까지 메모리에 유지
  }
}
