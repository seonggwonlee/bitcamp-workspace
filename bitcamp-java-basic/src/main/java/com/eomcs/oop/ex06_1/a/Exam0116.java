package com.eomcs.oop.ex06_1.a;

public class Exam0116 {
  public static void main(String[] args) {
    Car c = new Car();

    c.model = "티코";
    c.capacity = 5;
    c.cc = 890;
    c.valve = 16;

    Sedan s = (Sedan)c;
    // 애초의 Car 인스턴스를 가리키는 레퍼런스 변수로
    // 형변환을 통해 Sedan의 레퍼런스로 속인다해도
    // 컴파일은 통과할 수 있을지 모르나 실행에서 막히게 된다.
    s.sunroof = true;
    s.auto = true;
  }
}
