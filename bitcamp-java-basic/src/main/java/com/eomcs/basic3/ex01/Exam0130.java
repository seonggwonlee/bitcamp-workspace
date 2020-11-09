package com.eomcs.basic3.ex01;

public class Exam0130 {
  static class My {
    String name;
    int age;

    @Override
    public String toString() {
      return "My3 [name=" + name + ", age=" + age + "]";
    }
  }

  public static void main(String[] args) {
    My obj1 = new My();

    obj1.name = "홍길동";
    obj1.age = 12;

    System.out.println(obj1);
  }
}
