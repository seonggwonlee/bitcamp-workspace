package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

// 필터 실행 시 호출하는 메서드 규칙을 정의
public interface CommandFilter {
  void doFilter(Request request, FilterChain next) throws Exception ;
}
