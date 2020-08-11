package com.eomcs.oop.ex06_1.a;

public class Exam0114 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Car c2 = null;
    // 수퍼 클래스의 레퍼런스 변수로 서브 클래스의 인스턴스를 가리킬 수 있다.
    // 서브 클래스의 인스턴스에는 수퍼 클래스의 인스턴스 변수가 포함돼있기 때문이다.

    c2 = s;

    c2.model = "티코";
    c2.capacity = 5;
    c2.cc = 890;
    c2.valve = 16;
  }
}
