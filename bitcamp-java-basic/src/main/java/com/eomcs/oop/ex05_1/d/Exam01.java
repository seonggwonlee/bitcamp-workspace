package com.eomcs.oop.ex05_1.d;

public class Exam01 {

  public static void main(String[] args) {
    Sedan s1 = new Sedan("비트자동차", "티코", 5, true, true);
    System.out.printf("%s, %s, %d, %b, %b", s1.maker, s1.model, s1.capacity, s1.sunroof, s1.auto);
  }
}
