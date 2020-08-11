package com.eomcs.oop.ex06_1.a;

public class Exam0112 {

  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    // b2 = v;
    // 하위 클래스의 레퍼런스 변수로는 상위 클래스의 인스턴스를 참조할 수 없다.
    // 상위 클래스의 인스턴스에는 하위 클래스가 갖고있는 인스턴스 변수가 없을 수 있기 때문이다.
    // 위의 코드가 가능하다면

    b2.engine = true;
  }
}
