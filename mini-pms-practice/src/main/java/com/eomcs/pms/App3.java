package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    int[] no = new int[5];
    String[] projectName = new String[5];
    String[] content = new String[5];
    Date[] deadLine = new Date[5];
    int[] status = new int[5];
    String[] manager = new String[5];

    System.out.println("[작업]");

    Scanner in = new Scanner(System.in);

    int count = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("프로젝트?");
        projectName[i] = in.nextLine();

      System.out.print("번호?");
        no[i] = Integer.parseInt(in.nextLine());

      System.out.print("내용?");
        content[i] = in.nextLine();

      System.out.print("완료일?");
        deadLine[i] = Date.valueOf(in.nextLine());

      System.out.println("상태?");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
        status[i] = Integer.parseInt(in.nextLine());

      System.out.printf("담당자?");
        manager[i] = in.nextLine();

        count++;

        System.out.println("계속 하시겠습니까?(Y/n)");
        String answer = in.nextLine();
        if (!answer.equalsIgnoreCase("y")) {
          break;
        }
    }


    System.out.println("---------------");
    String statusValue = null;
    for (int i = 0; i < count; i++) {
      if (status[i] == 0) {
        statusValue = "신규";
      } if (status[i] == 1) {
        statusValue = "진행중";
      } if (status[i] == 2) {
        statusValue = "완료";
      }
    System.out.printf("%s, %d, %s, %s, %s, %s\n", projectName[i], no[i],
        content[i], deadLine[i], statusValue, manager[i]);
    }
  }
}
