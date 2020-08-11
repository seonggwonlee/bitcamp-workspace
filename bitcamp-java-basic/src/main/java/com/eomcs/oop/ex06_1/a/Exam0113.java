package com.eomcs.oop.ex06_1.a;

public class Exam0113 {

  public static void main(String[] args) {

    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    b2 = c;
    b2 = s;
    b2 = t;
    // 같은 수퍼 클래스의 서브 클래스 및 다른 서브클래스를 참조할 수 없다.
    // Bike 클래스의 인스턴스 변수를 갖고 있지 않기 때문이다.
  }
}
