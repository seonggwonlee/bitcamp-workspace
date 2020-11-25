package com.eomcs.oop.ex03_1;

// 클래스 변수의 응용

public class Exam0162 {
  static class Member {
    public static final int GUEST = 0;
    public static final int MEMBER = 1;
    public static final int MANAGER = 2;

    String id;
    String pwd;
    int type;
  }

  public static void main(String[] args) {
    Member m1 = new Member();
    m1.id = "sss";
    m1.pwd = "1111";
    m1.type = Member.GUEST;

    Member m2 = new Member();
    m2.id = "ddd";
    m2.pwd = "1111";
    m2.type = Member.MEMBER;

    Member m3 = new Member();
    m3.id = "eee";
    m3.pwd = "1111";
    m3.type = Member.MANAGER;

    System.out.println(m1.id);
    System.out.println(m2.id);
    System.out.println(m3.id);
  }
}
