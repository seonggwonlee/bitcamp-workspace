package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    class Task {

      int no;
      String project;
      String str;
      String content;
      Date completedDate;
      String state;
      String worker;

    }


    Scanner keyInput = new Scanner(System.in);

    final int LENGTH = 10;
    Task[] tasks = new Task[LENGTH];

    int count = 0;

    System.out.println("[작업]");

    for (int i = 0; i < LENGTH; i++) {
      count++;

      Task t = new Task();

      System.out.print("프로젝트? ");
      t.project = keyInput.nextLine();
      System.out.println();

      System.out.print("번호? ");
      t.str = keyInput.nextLine();

      System.out.print("내용? ");
      t.content = keyInput.nextLine();

      System.out.print("완료일? ");
      t.completedDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      t.state = keyInput.nextLine();

      System.out.print("담당자? ");
      t.worker = keyInput.nextLine();

      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N) ");
      String response = keyInput.nextLine();

      tasks[i] = t;

      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyInput.close();

    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      String statetitle;
      switch (t.state) {
        case "0":
          statetitle = "신규";
          break;
        case "1":
          statetitle = "진행중";
          break;
        default:
          statetitle = "완료";
      System.out.printf("%s, %s, %s, %s, %s\n", t.str, t.content, t.completedDate.toString(), statetitle, t.worker);
      }
    }
  }
}









