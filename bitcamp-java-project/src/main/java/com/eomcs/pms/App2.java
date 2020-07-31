package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  static class Test {

  int no;
  String title;
  String content;
  Date startDate;
  Date endDate;
  String owner;
  String members;

  }

  static int LENGTH = 5;
  static int count = 0;
  static Test[] test = new Test[LENGTH];

  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    InputMember();

    System.out.println("---------------------------");

    printMember();

  }
    static void InputMember() {
      Scanner keyInput = new Scanner(System.in);

      for (int i = 0; i < LENGTH; i++) {
        count++;

        Test t = new Test();

        System.out.print("번호? ");
        t.no = keyInput.nextInt();
        keyInput.nextLine();

        System.out.print("프로젝트명? ");
        t.title = keyInput.nextLine();

        System.out.print("내용? ");
        t.content = keyInput.nextLine();

        System.out.print("시작일? ");
        t.startDate = Date.valueOf(keyInput.nextLine());

        System.out.print("종료일? ");
        t.endDate = Date.valueOf(keyInput.nextLine());

        System.out.print("만든이? ");
        t.owner = keyInput.nextLine();

        System.out.print("팀원? ");
        t.members = keyInput.nextLine();

        System.out.println("계속 입력하시겠습니까? (y/N) ");
        String response = keyInput.nextLine();

        test[i] = t;

        if (!response.equalsIgnoreCase("y")) {
          break;
        }
      }
      keyInput.close();
    }
    static void printMember() {
      for (int i = 0; i < count; i++) {
        Test t = test[i];
      System.out.printf("번호: %d\n, 프로젝트명: %s, 내용: %s, 시작일: %s, 종료일: %s, 만든이: %s, 팀원: %s\n",
          t.no, t.title, t.content, t.startDate.toString(), t.endDate.toString(), t.owner, t.members);
      }
   }
}

    /*
     * if (response.equalsIgnoreCase("y")) {
      count += 1;

      System.out.print("번호? ");
      no[1] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      title[1] = keyInput.nextLine();

      System.out.print("내용? ");
      content[1] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[1] = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[1] = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[1] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[1] = keyInput.nextLine();


    System.out.println("계속 입력하시겠습니까? (y/N) ");
    response = keyInput.nextLine();

    if (response.equalsIgnoreCase("y")) {
      count += 1;

      System.out.print("번호? ");
      no[2] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      title[2] = keyInput.nextLine();

      System.out.print("내용? ");
      content[2] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[2] = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[2] = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[2] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[2] = keyInput.nextLine();


    System.out.println("계속 입력하시겠습니까? (y/N) ");
    response = keyInput.nextLine();

    if (response.equalsIgnoreCase("y")) {
      count += 1;

      System.out.print("번호? ");
      no[3] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      title[3] = keyInput.nextLine();

      System.out.print("내용? ");
      content[3] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[3] = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[3] = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[3] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[3] = keyInput.nextLine();


    System.out.println("계속 입력하시겠습니까? (y/N) ");
    response = keyInput.nextLine();

    if (response.equalsIgnoreCase("y")) {
      count += 1;

      System.out.print("번호? ");
      no[4] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      title[4] = keyInput.nextLine();

      System.out.print("내용? ");
      content[4] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[4] = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[4] = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[4] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[4] = keyInput.nextLine();
    }
   }
  }
 }
  */




//    if (count > 0) {
//    System.out.printf("번호: %d\n, 프로젝트명: %s, 내용: %s, 시작일: %s, 종료일: %s, 만든이: %s, 팀원: %s\n",
//        no[1], title[1], content[1], startDate[1].toString(), endDate[1].toString(), owner[1], members[1]);
//      if (count > 1) {
//        System.out.printf("번호: %d\n, 프로젝트명: %s, 내용: %s, 시작일: %s, 종료일: %s, 만든이: %s, 팀원: %s\n",
//            no[2], title[2], content[2], startDate[2].toString(), endDate[2].toString(), owner[2], members[2]);
//        if (count > 2) {
//          System.out.printf("번호: %d\n, 프로젝트명: %s, 내용: %s, 시작일: %s, 종료일: %s, 만든이: %s, 팀원: %s\n",
//              no[3], title[3], content[3], startDate[3].toString(), endDate[3].toString(), owner[3], members[3]);
//        if (count > 3) {
//            System.out.printf("번호: %d\n, 프로젝트명: %s, 내용: %s, 시작일: %s, 종료일: %s, 만든이: %s, 팀원: %s\n",
//                no[4], title[4], content[4], startDate[4].toString(), endDate[4].toString(), owner[4], members[4]);
//          }
//        }
//      }
//    }









