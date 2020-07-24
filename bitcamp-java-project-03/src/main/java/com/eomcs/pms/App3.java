package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    
    java.util.Scanner Input = new java.util.Scanner(System.in);
    
    System.out.print("프로젝트? ");
    String project = Input.nextLine();
    
    System.out.print("번호? ");
    String str = Input.nextLine();
    int no = Integer.parseInt(str);
    
    System.out.print("내용? ");
    String content = Input.nextLine();
    
    System.out.print("완료일? ");
    java.sql.Date endDate = java.sql.Date.valueOf(Input.nextLine()); // 날짜 형식은 반드시 YYYY-MM-DD
        
    System.out.println("상태? ");
    System.out.printf("0: 신규\n", "%s");
    System.out.printf("1: 진행중\n", "%s");
    System.out.printf("2: 완료\n", "%s");
    System.out.printf(">");
    String status = Input.nextLine();
    
    System.out.print("담당자? ");
    String superVisor = Input.nextLine();
    
    Input.close();
    
    System.out.printf("------------------------------------\n");
    System.out.printf("[%s]\n", "작업-03");
    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", endDate.toString());
    System.out.print("상태: ");
    switch (status) {
      case "0": System.out.println("신규");
      break;
      case "1" : System.out.println("진행중");
      break;
      default : System.out.println("완료");
    }
    
//      if (status.equals("0")) {
//        System.out.println("신규");        
//      }
//        else if (status.equals("1")) {
//          System.out.println("진행중");
//      }
//        else {
//          System.out.println("완료");
//      }
    System.out.printf("담당자: %s\n", superVisor);
  }
}
