package com.eomcs.corelib.ex01_1;

public class Exam0130 {

  static class My {
    String name;
    int age;
  }

  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1 == obj2);

    System.out.println(obj1.equals(obj2));
  }
  //equals는 Object에서 상속받는 메서드이다.
  // ==와 마찬가지로 인스턴스가 서로 같은 비교한다.
  // 내용물이 같은지 비교하고싶다면 재정의해야한다.
}
