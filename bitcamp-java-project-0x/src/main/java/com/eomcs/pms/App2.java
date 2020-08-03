package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    class Project {

    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;

    }

    Scanner keyInput = new Scanner(System.in);

    final int LENGTH = 10;

    Project[] projects = new Project[LENGTH];

    int count = 0;

    System.out.println("[프로젝트]");

    for (int i = 0; i < LENGTH; i++) {
      count++; // 입력할 때마다 몇 번 했는지 증감

      Project p = new Project();

      System.out.print("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      p.title = keyInput.nextLine();

      System.out.print("내용? ");
      p.content = keyInput.nextLine();

      System.out.print("시작일? ");
      p.startDate = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      p.endDate = Date.valueOf(keyInput.nextLine()); // p 객체 => p가 가리키는 객체 (Project 인스턴스)

      System.out.print("만든이? ");
      p.owner = keyInput.nextLine();

      System.out.print("팀원? ");
      p.members = keyInput.nextLine();

      System.out.println();

      projects[i] = p;

      System.out.print("계속 입력하시겠습니까? (y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
    }

    keyInput.close();

    System.out.println("---------------------------");

    for (int i = 0; i < count; i++) {// 0부터 입력한 갯수만큼
      Project p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          p.no, p.title, p.startDate.toString(), p.endDate.toString(), p.owner);
    }
  }
}








