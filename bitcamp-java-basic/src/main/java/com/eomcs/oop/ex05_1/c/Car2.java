package com.eomcs.oop.ex05_1.c;

// 원본 코드에 기능을 추가하고 싶을 때 2
// 원본 코드를 복사하여 새로운 클래스를 생성한 뒤 해당 클래스에 기능을 추가한다.
// 원본 코드를 직접 수정하는 것보다는 안전하나 원본 코드에 버그가 생기면
// 복사한 코드들을 전부 수정해야한다.


public class Car2 {
  String maker;
  String model;
  int capacity;
  boolean sunroof;
  boolean auto;

  public Car2 () {

  }

  public Car2(String maker, String model, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }

  public Car2(String maker, String model, int capacity, boolean sunroof, boolean auto) {
    this (maker, model, capacity);

    this.sunroof = sunroof;
    this.auto = auto;
  }
}
