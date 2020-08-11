package com.eomcs.oop.ex05_1.b;

// 원본 소스 코드에 기능을 추가할 때
// 1) 원본 소스 코드를 직접 수정한다.
// 원본 코드를 수정하면 기존 해당 클래스를 이용하던 모든 프로그램에 영향을 끼친다.
// 심각한 오류를 야기할 수 있다.
// 코드가 중첩되고 누적되어 매우 지저분해진다.
public class Car {
  String maker;
  String model;
  int capacity;
  boolean sunroof;
  boolean auto;

  public Car(String maker, String model, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }

  public Car(String maker, String model, int capacity, boolean sunroof, boolean auto) {
    this (maker, model, capacity);

    this.sunroof = sunroof;
    this.auto = auto;
  }
}
