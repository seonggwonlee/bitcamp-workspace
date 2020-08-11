package com.eomcs.oop.ex06_1.a;

public class Exam0511 {
  public static void main(String[] args) {
    Vehicle v = new Sedan();

    System.out.println(v instanceof Sedan);
    System.out.println(v instanceof Car);
    System.out.println(v instanceof Vehicle);
    System.out.println(v instanceof Object);

    System.out.println(v instanceof Truck);
    System.out.println(v instanceof Bike);

    // instanceof 연산자
    // 레퍼런스가 가리키는 인스턴스 주소가 특정 클래스인지 또는 그 서브 클래스인지 확인하는 연산자이다.
    // Object는 최상위 수퍼 클래스이므로 true가 나온다.
    // Car와 Vehicle은 Sedan의 수퍼 클래스이므로 true가 출력된다.
  }
}
