package com.eomcs.corelib.ex01_1;

public class Exam0140 {

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

    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj1);
    System.out.println(obj2);
  }
  // hash value
  // 각 데이터를 구분하기 위해 사용하는 특별한 정수 값이다.
  // 매우 낮은 확률로 다른 데이터라도 같은 해쉬코드 값이 출력될 수 있다.

}
