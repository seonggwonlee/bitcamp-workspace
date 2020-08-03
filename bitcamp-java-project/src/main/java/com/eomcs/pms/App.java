package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App {

  // 회원
  static final int LENGTH = 100;

  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];
  static int count = 0;

  //프로젝트
  static final int PLENGTH = 10;

  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];

  static int pcount = 0;

  //작업
  static final int TLENGTH = 10;

  static int[] tno = new int[TLENGTH];
  static String[] tproject = new String[TLENGTH];
  static String[] tstr = new String[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tcompletedDate = new Date[TLENGTH];
  static String[] tstate = new String[TLENGTH];
  static String[] tworker = new String[TLENGTH];

  static int tcount = 0;

  static Scanner keyInput = new Scanner(System.in);

  public static void main(String[] args) {

    loop :
    while (true) {

      String command = promptString("명령 > ");

      switch (command.toLowerCase()) {
        case "/member/add":
          addMember();
          break;

        case "/member/list":
          listMember();
          break;

        case "/project/add":
          addProject();
        break;

        case "/project/list":
          listProject();
          break;

        case "/task/add":
          addTask();
          break;

        case "/task/list":
          listTask();
          break;

        case "exit":
        case "quit":
          System.out.println("안녕");
          break loop;
        default:
          System.out.println("실행할 수 없는 명령어입니다.");
        }
      System.out.println("");
    }

    keyInput.close();

  } // 메인 메서드

  static void addMember() {

    System.out.println("[회원 등록]");

    no[count] = promptInt("번호 ? ");
    name[count] = promptString("이름 ? ");
    email[count] = promptString("이메일 ? ");
    password[count] = promptString("암호 ? ");
    photo[count] = promptString("사진 ? ");
    tel[count] = promptString("전화 ? ");
    registeredDate[count] = new Date(System.currentTimeMillis());

    count++;

  }
  static void listMember() {

  System.out.println("[회원 목록]");
  for (int i = 0; i < count; i++) {
    System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
        no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {

    System.out.println("[회원 프로젝트 등록]");

    System.out.print("번호? ");
    pno[pcount] = keyInput.nextInt();
    keyInput.nextLine();

    System.out.print("프로젝트명? ");
    ptitle[pcount] = keyInput.nextLine();

    System.out.print("내용? ");
    pcontent[pcount] = keyInput.nextLine();

    System.out.print("시작일? ");
    pstartDate[pcount] = Date.valueOf(keyInput.nextLine());

    System.out.print("종료일? ");
    pendDate[pcount] = java.sql.Date.valueOf(keyInput.nextLine());

    System.out.print("만든이? ");
    powner[pcount] = keyInput.nextLine();

    System.out.print("팀원? ");
    pmembers[pcount] = keyInput.nextLine();

    pcount++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pcount; i++) {// 0부터 입력한 갯수만큼
      System.out.printf("%d, %s, %s, %s, %s\n", pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }
  static void addTask() {

    System.out.println("[작업 등록]");


    System.out.print("번호? ");
    tno[tcount] = Integer.parseInt(keyInput.nextLine());

    System.out.print("내용? ");
    tcontent[tcount] = keyInput.nextLine();

    System.out.print("완료일? ");
    tcompletedDate[tcount] = Date.valueOf(keyInput.nextLine());

    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tstate[tcount] = keyInput.nextLine();

    System.out.print("담당자? ");
    tworker[tcount] = keyInput.nextLine();

    tcount++;
  }
  static void listTask() {
    for (int i = 0; i < tcount; i++) {
      String stateLabel;
      switch (tstate[i]) {
        case "0": stateLabel = "신규";
          break;
        case "1": stateLabel = "진행중";
          break;
        default: stateLabel =  "완료";
        }
      System.out.printf("%d, %s, %s, %s, %s\n", tno[i], tcontent[i], tcompletedDate[i].toString(), stateLabel, tworker[i]);
    }
  }
  static String promptString(String title) {
    System.out.print(title);
    return keyInput.nextLine();
  }

  static int promptInt(String title) {
    System.out.print(title);
    return Integer.parseInt(keyInput.nextLine());
  }

  static Date promptDate(String title) {
    System.out.print(title);
    return Date.valueOf(keyInput.nextLine());
   }
}