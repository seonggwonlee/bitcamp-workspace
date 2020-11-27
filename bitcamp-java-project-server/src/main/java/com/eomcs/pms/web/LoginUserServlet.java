package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;

@WebServlet("/auth/loginUser")
// Command 규칙에 따라 클래스를 정의한다.
public class LoginUserServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession session = request.getSession();

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>로그인 정보</title></head>");
    out.println("<body>");

    try {
      out.println("<h1>로그인 정보</h1>");
    Member member = (Member) session.getAttribute("loginUser");
    if (member == null) {
      out.println("<p>로그인 하지 않았습니다!</p>");
      return;
    }
    out.printf("<p>사용자 번호: %d</p>\n", member.getNo());
    out.printf("<p>이름: %s</p>\n", member.getName());
    out.printf("<p>이메일: %s</p>\n", member.getEmail());
    out.printf("<p>사진: %s</p>\n", member.getPhoto());
    out.printf("<p>전화: %s</p>\n", member.getTel());
    out.printf("<p>등록일: %s</p>\n", member.getRegisteredDate());
  } catch (Exception e) {
    out.println("<h2>작업 처리 중 오류 발생!</h2>");
    out.printf("<pre>%s</pre>\n", e.getMessage());

    StringWriter errOut = new StringWriter();
    e.printStackTrace(new PrintWriter(errOut));
    out.println("<h3>상세오류내용</h3>");
    out.printf("<pre>%s</pre>\n", errOut.toString());

    out.printf("<pre>%s</pre>\n", errOut.toString());
  }

  out.println("</body>");
  out.println("</html>");
  }
}
