package com.eomcs.oop.ex06_1.a;

public class Exam0512 {

  public static void main(String[] args) {
    Vehicle v = new Sedan();

    System.out.println(v.getClass() == Sedan.class);
    System.out.println(v.getClass() == Car.class);
    System.out.println(v.getClass() == Vehicle.class);
    System.out.println(v.getClass() == Truck.class);
    System.out.println(v.getClass() == Bike.class);
  }
  // getClass()
  // 레퍼런스 변수가 가리키는 인스턴스 실제 주소를 가져온다.
  // == 연산자를 활용하여 특정 한 클래스의 인스턴스 주소인지 확인할 때 사용한다.
}
