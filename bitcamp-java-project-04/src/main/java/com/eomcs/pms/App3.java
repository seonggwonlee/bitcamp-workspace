package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 10;

    int[] no = new int[LENGTH];
    String[] project = new String[LENGTH];
    String[] str = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] completedDate = new Date[LENGTH];
    String[] state = new String[LENGTH];
    String[] worker = new String[LENGTH];

    int count = 0;

    System.out.println("[작업]");

    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("프로젝트? ");
      project[i] = keyInput.nextLine();
      System.out.println();

      System.out.print("번호? ");
      str[i] = keyInput.nextLine();

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      completedDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      state[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();

      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N) ");
      String response = keyInput.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }


    keyInput.close();

    for (int i = 0; i < count; i++) {

    switch (state[i]) {
      case "0":
        System.out.println("신규");
        break;
      case "1":
        System.out.println("진행중");
        break;
      default:
        System.out.println("완료");
      }
    System.out.printf("%d, %s, %s, %s, %s\n", no[i], content[i], completedDate[i].toString(), state[i], worker[i]);
    }

  }
}









