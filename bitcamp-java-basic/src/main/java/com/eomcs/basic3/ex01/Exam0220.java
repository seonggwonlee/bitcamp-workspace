package com.eomcs.basic3.ex01;

public class Exam0220 {
  static class My {
    String name;
    int age;
    String tel;
    String email;
    int gender;
    boolean working;
  }
  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;
    obj1.tel = "1111";
    obj1.email = "aaa@a.com";
    obj1.gender = 1;
    obj1.working = true;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;
    obj2.tel = "1111";
    obj2.email = "aaa@a.com";
    obj2.gender = 1;
    obj2.working = true;

    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));

  }

}
