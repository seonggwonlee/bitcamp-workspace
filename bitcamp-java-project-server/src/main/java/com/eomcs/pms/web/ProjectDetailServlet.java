package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.ProjectService;

@WebServlet("/project/detail")
public class ProjectDetailServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    ProjectService projectService =
        (ProjectService) ctx.getAttribute("projectService");

    int no = Integer.parseInt(request.getParameter("no"));

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>프로젝트조회</title></head>");
    out.println("<body>");
    try {
      out.println("<h1>프로젝트 조회</h1>");

      Project project = projectService.get(no);
      List<Project> list = projectService.list();

      out.println("<form action='update' method='post'>");
      out.printf("번호: <input type='text' name='no' value='%d' readonly><br>\n", project.getNo());
      out.printf("프로젝트명: <input type='text' name='title' value='%s'><br>\n", project.getTitle());
      out.printf("내용: <textarea name='content'>%s</textarea><br>\n", project.getContent());
      out.printf("기간: %s ~ %s<br>\n", project.getStartDate(), project.getEndDate());
      out.printf("관리자: %s<br>\n", project.getOwner().getName());

      for (Project projects : list) {
        StringBuilder members = new StringBuilder();
        for (Member member : project.getMembers()) {
          if (members.length() > 0) {
            members.append(",");
          }
          members.append(member.getName());
        }

      out.printf("팀원: %s<br>\n", project.getMembers().toString());
      out.println("<p>");
      out.println("<button>변경</button>");
//      out.printf("<a href='delete?no=%d'>삭제</a>");
      out.println("</p>");
      out.println("</form>");

//      out.printf("프로젝트명: %s\n", project.getTitle());
//      out.printf("내용: %s\n", project.getContent());
//      out.printf("기간: %s ~ %s\n",
//          project.getStartDate(),
//          project.getEndDate());
//      out.printf("관리자: %s\n", project.getOwner().getName());
//      out.print("팀원: ");
//      project.getMembers().forEach(
//          member -> out.print(member.getName() + " "));
//      out.println();

//      out.println("작업:");
//      out.println("--------------------------------");
//
//      List<Task> tasks = taskService.listByProject(no);
//
//      out.println("번호, 작업내용, 마감일, 작업자, 상태");
//      for (Task task : tasks) {
//        String stateLabel = null;
//        switch (task.getStatus()) {
//          case 1:
//            stateLabel = "진행중";
//            break;
//          case 2:
//            stateLabel = "완료";
//            break;
//          default:
//            stateLabel = "신규";
//        }
//        out.printf("%d, %s, %s, %s, %s\n",
//            task.getNo(),
//            task.getContent(),
//            task.getDeadline(),
//            task.getOwner().getName(),
//            stateLabel);
//      }

    } catch (Exception e) {
      out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());

      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));

      out.printf("<pre>%s</pre>\n", errOut.toString());
    }

    out.println("</body>");
    out.println("</html>");
  }
}
