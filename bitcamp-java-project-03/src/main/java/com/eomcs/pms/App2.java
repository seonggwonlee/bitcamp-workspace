package com.eomcs.pms;

// import com.sun.java_cup.internal.runtime.Scanner;

public class App2 {

  public static void main(String[] args) {
    
    java.util.Scanner KeyInput = new java.util.Scanner(System.in);
    
    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");
    
        System.out.print("번호? ");
    int num = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.print("프로젝트명: ");
    String title= KeyInput.nextLine();
    
    System.out.print("내용: ");
    String content = KeyInput.nextLine();
    
    System.out.print("시작일: ");
    java.sql.Date startDate = java.sql.Date.valueOf(KeyInput.nextLine()); 
        
    System.out.print("종료일: ");
    java.sql.Date endDate = java.sql.Date.valueOf(KeyInput.nextLine());

    System.out.print("만든이: ");
    String created = KeyInput.nextLine();
        
    System.out.print("팀원: ");
    String members = KeyInput.nextLine();
    
    KeyInput.close();
    
    System.out.println("--------------------------------------");
        
    System.out.printf("번호: %d\n", num);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", startDate.toString());
    System.out.printf("종료일: %s\n", endDate.toString());
    System.out.printf("만든이: %s\n", created);
    System.out.printf("팀원: %s\n", members);
    
    
  }
}
