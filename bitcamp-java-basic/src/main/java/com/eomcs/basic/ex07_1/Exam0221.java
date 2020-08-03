package com.eomcs.basic.ex07_1;

public class Exam0221 {

  public static void main(String[] args) {
   hello("홍길동", 20);
   hello("임꺽정", 30);
   hello("장보고", 16);

  }
  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
  }
}
