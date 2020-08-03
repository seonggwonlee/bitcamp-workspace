package com.eomcs.basic.ex07_1;

public class Exam0250 {

  // 가변 파라미터
  // 선언할 변수가 가변적으로 변해야할 때 사용한다.
  // 배열 선언하여 사용하는 것과 비교하여 각각 장단점 존재한다.
  public static void main(String[] args) {
    hello(); // 변수 선언이 0일 때
    hello("홍길동");
    hello("홍길동", "임꺽정");
    String[] ar = {"홍길동", "임꺽정", "유관순"};
    hello(ar);

  }
  static void hello(String...names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 안녕하세요?\n", names[i]);
    }
  }
}
