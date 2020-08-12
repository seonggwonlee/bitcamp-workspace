package com.eomcs.oop.ex06_1.c;

public class B2 extends B {
  void m(float x) {
    System.out.println("B2의 m()");
  }
  // 오버라이딩 문법
  // 오버라이딩 사용을 위해선 메서드명, 파라미터 형식, 리턴 타입이 동일해야한다.
  // 파라미터 명은 달라도 된다.
  // 여기선 m메서드의 파라미터 형식이 float으로 B 클래스 m 메서드의 int와는 다르다.
  // 따라서 이건 오버라이딩이 아닌 오버로딩이 된다. => float 파라미터를 받는 m 메서드가 추가되었다.
}
