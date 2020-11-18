package com.eomcs.pms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.pms.util.Prompt;

public class TaskHandler {

  static final int LENGTH = 5;
  static int tsize = 0;
  static Task[] tasks = new Task[LENGTH];
  static Prompt prompt = new Prompt();

  public static class Task {
    int no;
    String title;
    String content;
    Date deadLine;
    int status;
    String manager;
  }

  public static void inputTasks() {
    Scanner in = new Scanner(System.in);

       Task task = new Task();

       task.title = prompt.promptString("프로젝트?");
       task.no = prompt.promptInt("번호?");
       task.content = prompt.promptString("내용?");
       task.deadLine = prompt.promptDate("완료일?");
       System.out.println("상태? ");
       System.out.println("0: 신규");
       System.out.println("1: 진행중");
       System.out.println("2: 완료");
       task.status = prompt.promptInt("");
       task.manager = prompt.promptString("담당자?");

         tasks[tsize++] = task;

         System.out.println("작업을 등록하였습니다.");
     }

  public static void printTasks() {
    String statusValue = null;
    for (int i = 0; i < tsize; i++) {
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
