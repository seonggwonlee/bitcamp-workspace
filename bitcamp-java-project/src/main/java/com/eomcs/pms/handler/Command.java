package com.eomcs.pms.handler;

import java.util.Map;

// 사용자의 명령을 처리하는 객체에 대해 호출할 메서드 규칙을 정의 한다.
public interface Command {
    // => command 객체들 간 데이터 교환을 위해 맵 객체를 파라미터로 넘긴다.
  void execute(Map<String,Object> context);
}
