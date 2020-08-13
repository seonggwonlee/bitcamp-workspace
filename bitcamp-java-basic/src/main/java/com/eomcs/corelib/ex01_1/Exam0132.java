package com.eomcs.corelib.ex01_1;

public class Exam0132 {

  static class Member {
    String name;
    int age;

    public Member (String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

    System.out.println(m1 == m2);
    System.out.println(m1.equals(m2));
    // equals는 두 인스턴스가 같은지 비교한다 (내용물 X)
    // 만약 내용물을 비교하싶으면 재정의한다.
    // == 연산자와 동일하게 동작한다.
    // 여기서는 재정의하지않아 두 인스턴스는 다르기 때문에 false출력

    System.out.println("------------");

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);

    System.out.println(s1.equals(s2));
  }
  // String 클래스 재정의 했으므로 true
}
