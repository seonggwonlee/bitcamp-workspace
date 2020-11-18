package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.util.Prompt;

public class MemberHandler {

  static final int LENGTH = 5;
  static int size = 0;
  static Member[] members = new Member[LENGTH];
  static Prompt prompt = new Prompt();

  public static class Member {
    int no;
    String name;
    String email;
    String password;
    String picture;
    String tel;
    Date registeredDate = new Date(System.currentTimeMillis());
  }

  public static void inputMembers() {

    Member member = new Member();
    System.out.println("[회원 등록]");
    member.no = prompt.promptInt("번호? ");
    member.name = prompt.promptString("이름? ");
    member.email = prompt.promptString("이메일? ");
    member.password = prompt.promptString("암호? ");
    member.picture = prompt.promptString("사진? ");
    member.tel = prompt.promptString("전화? ");

    member.registeredDate = new Date(System.currentTimeMillis());

    members[size++] = member;
    System.out.println("회원이 등록되었습니다.");
    }

  public static void printMembers() {
    for (int i = 0; i < size; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", m.no, m.name, m.email, m.password,
          m.picture, m.tel, m.registeredDate);
    }
  }

  public static void findByName(String name) {
    for (int i = 0; i < size; i++) {
      Member member = members[i];
      if (member.name.equals(name)) {
        return member;
      }
    }
      return null;
  }
}
