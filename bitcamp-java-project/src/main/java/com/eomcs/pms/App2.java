package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    
    int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
    int count = 1;
    
    String title1="", title2="", title3="", title4="", title5="";
    String content1="", content2="", content3="", content4="", content5="";
    Date startDate1=null, startDate2=null, startDate3=null, startDate4=null, startDate5=null;
    Date endDate1=null, endDate2=null, endDate3=null, endDate4=null, endDate5=null;
    String created1="", created2="", created3="", created4="", created5="";
    String members1="", members2="", members3="", members4="", members5="";
    
            
    Scanner KeyInput = new Scanner(System.in);
    
    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");
    
    System.out.print("번호? ");
    num1 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.print("프로젝트명: ");
    title1= KeyInput.nextLine();
    
    System.out.print("내용: ");
    content1 = KeyInput.nextLine();
    
    System.out.print("시작일: ");
    startDate1 = Date.valueOf(KeyInput.nextLine()); 
        
    System.out.print("종료일: ");
    endDate1 = Date.valueOf(KeyInput.nextLine());

    System.out.print("만든이: ");
    created1 = KeyInput.nextLine();
        
    System.out.print("팀원: ");
    members1 = KeyInput.nextLine();
    
    System.out.print("계속 입력하시겠습니까? (y/N)");
    String response = KeyInput.nextLine();
    
    // 2번
    if (response.equalsIgnoreCase("y")) {
      count++;
      
      System.out.print("번호? ");
      num2 = KeyInput.nextInt();
      KeyInput.nextLine();

      System.out.print("프로젝트명: ");
      title2= KeyInput.nextLine();
      
      System.out.print("내용: ");
      content2 = KeyInput.nextLine();
      
      System.out.print("시작일: ");
      startDate2 = Date.valueOf(KeyInput.nextLine()); 
          
      System.out.print("종료일: ");
      endDate2 = Date.valueOf(KeyInput.nextLine());

      System.out.print("만든이: ");
      created2 = KeyInput.nextLine();
          
      System.out.print("팀원: ");
      members2 = KeyInput.nextLine();
      
      System.out.print("계속 입력하시겠습니까? (y/N)");
      response = KeyInput.nextLine();
      
      System.out.println("");
      
      // 3번
        if (response.equalsIgnoreCase("y")) {
          count++;
          
          System.out.print("번호? ");
          num3 = KeyInput.nextInt();
          KeyInput.nextLine();

          System.out.print("프로젝트명: ");
          title3= KeyInput.nextLine();
          
          System.out.print("내용: ");
          content3 = KeyInput.nextLine();
          
          System.out.print("시작일: ");
          startDate3 = Date.valueOf(KeyInput.nextLine()); 
              
          System.out.print("종료일: ");
          endDate3 = Date.valueOf(KeyInput.nextLine());

          System.out.print("만든이: ");
          created3 = KeyInput.nextLine();
              
          System.out.print("팀원: ");
          members3 = KeyInput.nextLine();
          
          System.out.print("계속 입력하시겠습니까? (y/N)");
          response = KeyInput.nextLine();
          
          System.out.println("");
          
          // 4번
          if (response.equalsIgnoreCase("y")) {
            count++;
            
            System.out.print("번호? ");
            num4 = KeyInput.nextInt();
            KeyInput.nextLine();

            System.out.print("프로젝트명: ");
            title4 = KeyInput.nextLine();
            
            System.out.print("내용: ");
            content4 = KeyInput.nextLine();
            
            System.out.print("시작일: ");
            startDate4 = Date.valueOf(KeyInput.nextLine()); 
                
            System.out.print("종료일: ");
            endDate4 = Date.valueOf(KeyInput.nextLine());

            System.out.print("만든이: ");
            created4 = KeyInput.nextLine();
                
            System.out.print("팀원: ");
            members4 = KeyInput.nextLine();
            
            System.out.print("계속 입력하시겠습니까? (y/N)");
            response = KeyInput.nextLine();
            
            System.out.println("");
            
            // 5번
            if (response.equalsIgnoreCase("y")) {
              count++;
              
              System.out.print("번호? ");
              num5 = KeyInput.nextInt();
              KeyInput.nextLine();

              System.out.print("프로젝트명: ");
              title5= KeyInput.nextLine();
              
              System.out.print("내용: ");
              content5 = KeyInput.nextLine();
              
              System.out.print("시작일: ");
              startDate5 = Date.valueOf(KeyInput.nextLine()); 
                  
              System.out.print("종료일: ");
              endDate5 = Date.valueOf(KeyInput.nextLine());

              System.out.print("만든이: ");
              created5 = KeyInput.nextLine();
                  
              System.out.print("팀원: ");
              members5 = KeyInput.nextLine();
              
              System.out.print("계속 입력하시겠습니까? (y/N)");
              response = KeyInput.nextLine();
              
              System.out.println("");
            }
          }
        }
      }
        
    KeyInput.close();
    
    System.out.println("--------------------------------------");
    
    
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num1, title1, content1, startDate1.toString(), endDate1.toString(), created1, members1);
    if(count > 1) {
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num2, title2, content2, startDate2.toString(), endDate2.toString(), created2, members2);
      if(count > 2) {
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num3, title3, content3, startDate3.toString(), endDate3.toString(), created3, members3);
        if(count > 3) {    
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num4, title4, content4, startDate4.toString(), endDate4.toString(), created4, members4);
          if(count > 4) {
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num5, title5, content5, startDate5.toString(), endDate5.toString(), created5, members5);
          }
        }
      }
    }
  }
}
