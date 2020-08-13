package com.eomcs.corelib.ex01_1;

public class Exam0121 {

  static class My {
    String name;
    int age;


  @Override
  public String toString() {
    return "My3 [name=" + name + ", age="+ age +"]";
  }
  // 인스턴스의 값을 간단히 확인하고 싶을 때 => toString을 오버라이딩
}
  public static void main(String[] args) {
    My obj1 = new My();

    obj1.name = "홍길동";
    obj1.age = 20;

    System.out.println(obj1.toString());
    System.out.println(obj1);
  }
}
