package com.eomcs.corelib.ex02_1;

public class Exam0120 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    // s1과 s2의 인스턴스는 다르나 내용물은 같다.
    // equals는 그 내용물을 비교해준다.
    // String 클래스에는 자체 소스 내에 equals를 오버라이딩 하였기 때문에 내용물 비교이다.
    // 그러나 Object클래스에서 직접 가져온 equals는 인스턴스 자체를 비교하는 것이다.
  }
}
