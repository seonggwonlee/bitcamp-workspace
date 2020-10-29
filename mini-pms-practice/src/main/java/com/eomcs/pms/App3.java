package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  static class Task {
    int no;
    String title;
    String content;
    Date deadLine;
    int status;
    String manager;
  }

  static final int LENGTH = 5;
  static int count = 0;
  static Task[] tasks = new Task[LENGTH];

  static void inputTasks() {
   Scanner in = new Scanner(System.in);


    for (int i = 0; i < 5; i++) {
      Task task = new Task();

      System.out.print("프로젝트?");
        task.title = in.nextLine();

      System.out.print("번호?");
        task.no = Integer.parseInt(in.nextLine());

      System.out.print("내용?");
        task.content = in.nextLine();

      System.out.print("완료일?");
        task.deadLine = Date.valueOf(in.nextLine());

      System.out.println("상태?");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
        task.status = Integer.parseInt(in.nextLine());

      System.out.printf("담당자?");
        task.manager = in.nextLine();

        tasks[count++] = task;

        System.out.println("계속 하시겠습니까?(Y/n)");
        String answer = in.nextLine();
        if (!answer.equalsIgnoreCase("y")) {
          break;
        }
    }
  }

  public static void main(String[] args) {
    System.out.println("[작업]");

    inputTasks();

    System.out.println("---------------");

    printTasks();
  }

  static void printTasks() {
    String statusValue = null;
    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      switch (t.status) {
        case 1:
          statusValue = "진행중";
          break;
        case 2:
          statusValue = "완료";
          break;
        default:
          statusValue = "신규";
      }
    System.out.printf("%s, %d, %s, %s, %s, %s\n", t.title, t.no,
        t.content, t.deadLine, statusValue, t.manager);
    }
  }
}
