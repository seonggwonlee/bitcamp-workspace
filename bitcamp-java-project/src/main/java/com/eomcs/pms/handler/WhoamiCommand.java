package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

// Command 규칙에 따라 클래스를 정의한다.
public class WhoamiCommand implements Command {

  @Override
  public void execute(Map<String,Object> context) {
    try {

      Member member = (Member) context.get("loginUser");

      if (member == null) {
        System.out.println("로그인 하지 않았습니다.");
      } else {
      System.out.printf("사용자 번호 : %d\n",member.getNo());
      System.out.printf("이름 : %s\n",member.getName());
      System.out.printf("이메일 : %s\n",member.getEmail());
      System.out.printf("사진 : %s\n",member.getPhoto());
      System.out.printf("전화 : %s\n",member.getTel());
      System.out.printf("등록일 : %s\n",member.getRegisteredDate());
      }
    }catch (Exception e) {
    System.out.println("로그인 중 오류 발생");
    e.printStackTrace();
    }
  }
}