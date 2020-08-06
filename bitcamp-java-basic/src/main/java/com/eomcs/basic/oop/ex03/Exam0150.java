package com.eomcs.basic.oop.ex03;

public class Exam0150 {
  static class Car {
    // 클래스 필드
    // - 모든 인스턴스가 공유하는 값을 저장하는 용도이다.
    static int count;

    static final int SEDAN = 1;
    static final int TRUCK = 2; // 상수는 고정값이므로 인스턴스 변수 생성될 때 마다 고정값을 가지고 계속 생성된다.
    // 비효율적이므로 웬만해서는 스태틱을 붙이게 된다.


    // 인스턴스 필드
    // - 개별적으로 관리되어야 할 값을 저장하는 용도이다.
    String model;
    String no;
    int cc;
    int type;
  }

  public static void main(String[] args) {



    Car c1 = new Car();
    Car c2 = new Car();

    c1.model = "티코";
    c1.no = "40-1111";
    c1.cc = 980;
    c1.type = Car.SEDAN; // 승용차
    Car.count++;

    c2.model = "타이탄";
    c2.no = "50-2222";
    c2.cc = 10000;
    c2.type = Car.TRUCK; // 트럭
    Car.count++;

    System.out.printf("%s, %s, %d\n", c1.model, c1.no, c1.cc);
    System.out.printf("%s, %s, %d\n", c2.model, c2.no, c2.cc);
    System.out.println(Car.count);
    }
}
