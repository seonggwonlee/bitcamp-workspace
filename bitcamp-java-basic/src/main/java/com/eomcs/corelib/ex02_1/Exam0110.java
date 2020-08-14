package com.eomcs.corelib.ex02_1;

public class Exam0110 {
  public static void main(String[] args) {
    String s1;

    s1 = new String("Hello");
    String s2 = new String("Hello");
    // new 연산자로 Heap메모리에 생성한다.
    // 내용물의 동일 여부 따지지 않고 무조건 인스턴스 생성한다

    System.out.println(s1 == s2);
    // 두 값의 인스턴스는 다르다.
  }
}
