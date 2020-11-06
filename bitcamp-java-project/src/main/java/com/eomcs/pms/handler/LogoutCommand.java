package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

// Command 규칙에 따라 클래스를 정의한다.
public class LogoutCommand implements Command {

  @Override
  public void execute(Map<String,Object> context) {
    try {
    Member member = (Member) context.get("loginUser");
    if (member == null) {
      System.out.println("로그인 된 상태가 아닙니다.");
      return;
    } else {
    System.out.printf("%s님 안녕히 가세요.\n", member.getName());
      context.remove("loginUser");
    }
  } catch (Exception e) {
    System.out.println("로그아웃 중 오류 발생");
    e.printStackTrace();
    }
  }
}
