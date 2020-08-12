package com.eomcs.oop.ex06_1.c;

public class A4 extends A3{
  String age;
  boolean working = false;

  void print3() {
    System.out.printf("'%s(%s, %d세)'님, 안녕하세요?\n", this.name, this.age, super.age);
  }

  void test() {
    System.out.printf("this.tel = %s, this.working = %s\n", this.tel, this.working);
    System.out.printf("super.tel = %s, super.working = %s\n", super.tel, super.working);
  }
}
