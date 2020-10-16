package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberAddCommand implements Command {

  List<Member> memberList;

  public MemberAddCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
    out.println("[회원 등록]");

    Member member = new Member();
    member.setNo(Prompt.inputInt("번호? ", out, in));
    member.setName(Prompt.inputString("이름? ", out, in));
    member.setEmail(Prompt.inputString("이메일? ", out, in));
    member.setPassword(Prompt.inputString("암호? ", out, in));
    member.setPhoto(Prompt.inputString("사진? ", out, in));
    member.setTel(Prompt.inputString("전화? ", out, in));
    member.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));

    memberList.add(member);
    out.println("회원을 등록하였습니다.");
    } catch (Exception e) {
      System.out.printf("예외 처리 발생 - %s\n", e.getMessage());
    }
  }
}
