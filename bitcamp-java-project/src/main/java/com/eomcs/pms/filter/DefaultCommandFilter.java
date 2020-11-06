package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.Request;

// 이 필터의 역할 : 커맨드 객체를 찾아 실행한다.
public class DefaultCommandFilter implements CommandFilter {
  @SuppressWarnings("unchecked")
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    // Request 보관소에서 context맵 객체를 꺼낸다.
    Map<String,Object> context = request.getContext();
    // Request 보관소에서 커맨드 객체가 들어있는 맵을 꺼낸다.
    Map<String,Command> commandMap = (Map<String,Command>) context.get("commandMap");
    // 사용자가 입력한 명령에 따라 커맨드 객체 실행
  }
}
