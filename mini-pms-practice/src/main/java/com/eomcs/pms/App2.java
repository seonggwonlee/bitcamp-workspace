package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] no = new int[5];
    String[] title = new String[5];
    String[] content = new String[5];
    Date[] startDate = new Date[5];
    Date[] endDate = new Date[5];
    String[] creator = new String[5];
    String[] member = new String[5];

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
