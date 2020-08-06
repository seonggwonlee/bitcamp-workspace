package com.eomcs.basic.oops_1;

public class Exam0160_3 {

  static class Member {
    String id;
    String pwd;
    int type;

    static final int GUEST = 0;
    static final int MEMBER = 1;
    static final int MANAGER = 2;// 0 : 손님, 1 : 회원, 2 : 관리자
    // 모든 인스턴스가 같은 값을 가질 경우 클래스 변수로 사용하는 것이 더욱 효율적이다.
    // 값을 조회하는 용도로만 사용한다면 final과 대문자를 사용하여 상수임을 표기하는 것이 옳다.
  }

  public static void main(String[] args) {
    Member m1 = new Member();
    m1.id = "aaa";
    m1.pwd = "1111";
    m1.type = Member.GUEST;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.pwd = "2222";
    m2.type = Member.MEMBER;

    Member m3 = new Member();
    m3.id = "ccc";
    m3.pwd = "3333";
    m3.type = Member.MANAGER;
  }
}
