package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.util.Prompt;

public class ProjectHandler {

  static final int LENGTH = 5;
  static int psize = 0;
  static Project[] projects = new Project[LENGTH];
  static Prompt prompt = new Prompt();

  public static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String creator;
    String member;
  }

  public static void inputProjects() {

    Project project = new Project();
    System.out.println("[회원 등록]");
    project.no = prompt.promptInt("번호? ");
    project.title = prompt.promptString("프로젝트명? ");
    project.content = prompt.promptString("내용 ? ");
    project.startDate = prompt.promptDate("시작일 ? ");
    project.endDate = prompt.promptDate("종료일 ? ");
    while (true) {
      String name = prompt.promptString("만든이 ? ");
      if (MemberHandler.findByName(name) != null) {
        project.creator = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }
    project.member = prompt.promptString("팀원 ? ");

    projects[psize++] = project;

    System.out.println("프로젝트가 등록되었습니다. ");
    }

  public static void printProjects() {
    for (int i = 0; i < psize; i++) {
      Project p = projects[i];
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", p.no, p.title, p.content, p.startDate,
        p.endDate, p.creator, p.member);
    }
  }
}
