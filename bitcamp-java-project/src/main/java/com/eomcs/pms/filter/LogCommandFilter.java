package com.eomcs.pms.filter;

import java.io.FileWriter;
import java.io.PrintWriter;
import com.eomcs.pms.handler.Request;

public class LogCommandFilter implements CommandFilter {
  PrintWriter logOut;

  public LogCommandFilter (String file) throws Exception {
    logOut = new PrintWriter(new FileWriter(file));
  }
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    logOut.println(request.getCommandPath());
  }
}
