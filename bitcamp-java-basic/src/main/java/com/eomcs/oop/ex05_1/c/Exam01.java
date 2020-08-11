package com.eomcs.oop.ex05_1.c;

public class Exam01 {

  public static void main(String[] args) {
    Car2 c1 = new Car2("비트자동차", "티코", 5, true, true);
    System.out.printf("%s, %s, %d, %b, %b", c1.maker, c1.model, c1.capacity, c1.sunroof, c1.auto);
  }
}
