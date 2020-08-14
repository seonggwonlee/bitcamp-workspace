package com.eomcs.corelib.ex02_1;

public class Exam0122 {
  static class Member{
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
    public static void main(String[] args) {
      Member m1 = new Member("홍길동", 20);
      Member m2 = new Member("홍길동", 20);

      System.out.println(m1 == m2);
      // m1과 m2는 같은 값이나, 인스턴스는 다르다.

      System.out.println(m1.equals(m2));
      // Member는 Object에서 상속 받은 equals()를 오버라이딩 하지 않았다.
      // 따라서 내용물이 아닌 인스턴스의 비교를 실행하기 때문에 false
    }
  }
