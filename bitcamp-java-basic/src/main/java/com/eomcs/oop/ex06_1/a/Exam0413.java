package com.eomcs.oop.ex06_1.a;

public class Exam0413 {

  static void printCar(Car car) {
    System.out.printf("모델명 : %s\n", car.model);
    System.out.printf("배기량 : %dcc\n", car.cc);
  }

  public static void main(String[] args) {
    Sedan s1 = new Sedan();
    s1.model = "티코";
    s1.cc = 890;

    Truck t1 = new Truck();
    t1.model = "타이탄";
    t1.cc = 10000;

    printCar(s1);
    printCar(t1);
  }

  // 하나의 메서드로 Sedan과 Truck을 모두 출력할 수 있다.
  // Sedan과 Truck의 수퍼 클래스인 Car 클래스를 이용한다.
  // 즉 위와 같이 다형적 변수 이용한다.
}
