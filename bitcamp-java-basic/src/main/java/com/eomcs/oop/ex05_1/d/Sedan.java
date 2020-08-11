package com.eomcs.oop.ex05_1.d;

public class Sedan extends Car {

  boolean sunroof;
  boolean auto;

  Sedan (String maker, String model, int capacity, boolean sunroof, boolean auto) {
    this.maker = maker;
    this.model = model;
    this.capacity = capacity;
    this.sunroof = sunroof;
    this.auto = auto;
  }
}
