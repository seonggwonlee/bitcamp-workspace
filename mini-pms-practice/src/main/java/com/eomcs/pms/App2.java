package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  static Scanner in = new Scanner(System.in);

  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String creator;
    String member;
  }

  static final int LENGTH = 5;
  static int count = 0;
  static Project[] projects = new Project[LENGTH];

  static void inputProjects() {

    for (int i = 0; i < 5; i++) {

    Project project = new Project();

    System.out.print("번호 ? ");
    project.no = Integer.parseInt(in.nextLine());

    System.out.print("프로젝트명? ");
    project.title = in.nextLine();

    System.out.print("내용 ? ");
    project.content = in.nextLine();

    System.out.print("시작일 ? ");
    project.startDate = Date.valueOf(in.nextLine());

    System.out.print("종료일 ? ");
    project.endDate = Date.valueOf(in.nextLine());

    System.out.print("만든이 ? ");
    project.creator = in.nextLine();

    System.out.print("팀원 ? ");
    project.member = in.nextLine();

    projects[count++] = project;
    System.out.println("계속 입력하시겠습니까?(Y/n)");
    String answer = in.nextLine();
    if (!answer.equalsIgnoreCase("y")) {
      break;
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    inputProjects();

    System.out.println("----------------");

    printProjects();

  }

  static void printProjects() {
    for (int i = 0; i < count; i++) {
      Project p = projects[i];
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", p.no, p.title, p.content, p.startDate,
        p.endDate, p.creator, p.member);
    }
  }
}
