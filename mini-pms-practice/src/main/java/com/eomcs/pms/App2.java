package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    final int LENGTH = 5;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] creator = new String[LENGTH];
    String[] member = new String[LENGTH];

    System.out.println("[프로젝트]");

    int count = 0;

    for (int i = 0; i < 3; i++) {

    System.out.print("번호 ? ");
    no[i] = Integer.parseInt(in.nextLine());

    System.out.print("프로젝트명? ");
    title[i] = in.nextLine();

    System.out.print("내용 ? ");
    content[i] = in.nextLine();

    System.out.print("시작일 ? ");
    startDate[i] = Date.valueOf(in.nextLine());

    System.out.print("종료일 ? ");
    endDate[i] = Date.valueOf(in.nextLine());

    System.out.print("만든이 ? ");
    creator[i] = in.nextLine();

    System.out.print("팀원 ? ");
    member[i] = in.nextLine();

    count++;
    System.out.println("계속 입력하시겠습니까?(Y/n)");
    String answer = in.nextLine();
    if (!answer.equalsIgnoreCase("y")) {
      break;
      }
    }
    in.close();

    System.out.println("----------------");

    for (int i = 0; i < count; i++) {
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[i], title[i], content[i], startDate[i],
        endDate[i], creator[i], member[i]);
    }
  }
}
