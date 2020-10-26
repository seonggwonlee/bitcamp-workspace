package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner in = new Scanner(System.in);

    System.out.print("프로젝트?");
    String projectName = in.nextLine();

    System.out.print("번호?");
    int no = Integer.parseInt(in.nextLine());

    System.out.print("내용?");
    String content = in.nextLine();

    System.out.print("완료일?");
    Date deadLine = Date.valueOf(in.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    int status = Integer.parseInt(in.nextLine());

    System.out.printf("담당자?");
    String manager = in.nextLine();

    in.close();

    System.out.println("---------------");

    System.out.printf("프로젝트: %s\n", projectName);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", deadLine);
    if (status == 0) {
      System.out.println("상태 : 신규");
    } else if (status == 1) {
    System.out.println("상태 : 진행중");
    } else if (status == 2) {
    System.out.println("상태 : 완료");
    }
    System.out.printf("담당장: %s\n", manager);
  }
}
