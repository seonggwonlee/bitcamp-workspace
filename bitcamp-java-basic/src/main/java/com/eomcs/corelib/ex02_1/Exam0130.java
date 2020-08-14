package com.eomcs.corelib.ex02_1;

public class Exam0130 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1.hashCode() == s2.hashCode());

    // 기본적으로 객체가 다르면 해시코드도 다르다.
    // 그러나 String 클래스에서 hashcode는 서로 다른 객체라도 문자열(내용물)이 같으면
    // 같은 해시코드가 출력되도록 오버라이딩 돼있다.
    // HashMap이나 Hashtable등에서 사용한다.
  }
}
