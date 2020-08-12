package com.eomcs.oop.ex06_1.c;

public class A3 extends A {
  int age;
  String tel = "A3A3A3";

  @Override
  void print() {
    System.out.printf("%s(%d세)님, 안녕하세요?\n", this.name, this.age);
  }
}
