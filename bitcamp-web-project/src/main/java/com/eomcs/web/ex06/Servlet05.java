// 컨텍스트 초기화 파라미터 - web.xml에서 설정하기
package com.eomcs.web.ex06;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿의 DD 설정으로 지정한 초기화 파라미터 값은 그 서블릿에서만 사용할 수 있다.
// 모든 서블릿에서 사용할 값을 설정하려면 컨텍스트 파라미터로 설정해야 한다.
// => web.xml 에 지정하였다.
//
@WebServlet("/ex06/s5")
@SuppressWarnings("serial")
public class Servlet05 extends HttpServlet {

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    // 컨텍스트 초기화 파라미터 값을 꺼내려면 ServletContext 객체가 있어야 한다.
    ServletContext sc = this.getServletContext();
    ServletContext sc2 = req.getServletContext();
    ServletContext sc3 = this.getServletConfig().getServletContext();
    // 세 가지 중 편한 걸로 하면 된다.

    System.out.printf("driver=%s\n", sc.getInitParameter("jdbc2.driver"));
    System.out.printf("url=%s\n", sc.getInitParameter("jdbc2.url"));
    System.out.printf("username=%s\n", sc.getInitParameter("jdbc2.username"));
    System.out.printf("password=%s\n", sc.getInitParameter("jdbc2.password"));
  }
}

