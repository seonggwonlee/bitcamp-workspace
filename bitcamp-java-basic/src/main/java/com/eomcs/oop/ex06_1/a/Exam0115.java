package com.eomcs.oop.ex06_1.a;

public class Exam0115 {
  public static void main(String[] args) {
    Car c = new Sedan();

    c.model = "티코";
    c.capacity = 5;
    c.cc = 890;
    c.valve = 16;

    // 상위 클래스의 레퍼런스로 서브 클래스의 인스턴스 변수를 가리킬 때
    // 서브 클래스를 가리키긴 하나, 레퍼런스 타입을 벗어날 수 없다.
    // 즉, Car class의 레퍼런스의 범위를 벗어날 수 없다.
    // 자바 컴파일러는 레퍼런스가 어떤 인스턴스를 가리키는 지 여부를 판단하지 않고,
    // 해당 레퍼런스 타입만을 한정하여 클래스 멤버 사용을 허락한다.

    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;
    // 수퍼 클래스 레퍼런스 변수로 서브 클래스의 인스턴스를 가리키고 싶다면
    // 형변환 이용하여 위와 같이 Car타입을 Sedan타입으로 변경하면 된다.

    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;
    // 또는 인스턴스의 원래 클래스 레퍼런스에 저장 후 사용하는 방법도 있다.
  }
}
