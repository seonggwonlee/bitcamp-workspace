package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    
    int[] num = new int[5];
    int count = 1;
    
    String[] title = new String[5];
    String[] content = new String[5];
    Date[] startDate = new Date[5];
    Date[] endDate = new Date[5];
    String[] created = new String[5];
    String[] members =new String[5];
    
    Scanner KeyInput = new Scanner(System.in);
    
    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");
    
    System.out.print("번호? ");
    num[0] = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.print("프로젝트명: ");
    title[0] = KeyInput.nextLine();
    
    System.out.print("내용: ");
    content[0] = KeyInput.nextLine();
    
    System.out.print("시작일: ");
    startDate[0] = Date.valueOf(KeyInput.nextLine()); 
        
    System.out.print("종료일: ");
    endDate[0] = Date.valueOf(KeyInput.nextLine());

    System.out.print("만든이: ");
    created[0] = KeyInput.nextLine();
        
    System.out.print("팀원: ");
    members[0] = KeyInput.nextLine();
    
    System.out.print("계속 입력하시겠습니까? (y/N)");
    String response = KeyInput.nextLine();
    
    // 2번
    if (response.equalsIgnoreCase("y")) {
      count++;
      
      System.out.print("번호? ");
      num[1] = KeyInput.nextInt();
      KeyInput.nextLine();

      System.out.print("프로젝트명: ");
      title[1]= KeyInput.nextLine();
      
      System.out.print("내용: ");
      content[1] = KeyInput.nextLine();
      
      System.out.print("시작일: ");
      startDate[1] = Date.valueOf(KeyInput.nextLine()); 
          
      System.out.print("종료일: ");
      endDate[1] = Date.valueOf(KeyInput.nextLine());

      System.out.print("만든이: ");
      created[1] = KeyInput.nextLine();
          
      System.out.print("팀원: ");
      members[1] = KeyInput.nextLine();
      
      System.out.print("계속 입력하시겠습니까? (y/N)");
      response = KeyInput.nextLine();
      
      System.out.println("");
      
      // 3번
        if (response.equalsIgnoreCase("y")) {
          count++;
          
          System.out.print("번호? ");
          num[2] = KeyInput.nextInt();
          KeyInput.nextLine();

          System.out.print("프로젝트명: ");
          title[2]= KeyInput.nextLine();
          
          System.out.print("내용: ");
          content[2] = KeyInput.nextLine();
          
          System.out.print("시작일: ");
          startDate[2] = Date.valueOf(KeyInput.nextLine()); 
              
          System.out.print("종료일: ");
          endDate[2] = Date.valueOf(KeyInput.nextLine());

          System.out.print("만든이: ");
          created[2] = KeyInput.nextLine();
              
          System.out.print("팀원: ");
          members[2] = KeyInput.nextLine();
          
          System.out.print("계속 입력하시겠습니까? (y/N)");
          response = KeyInput.nextLine();
          
          System.out.println("");
          
          // 4번
          if (response.equalsIgnoreCase("y")) {
            count++;
            
            System.out.print("번호? ");
            num[3] = KeyInput.nextInt();
            KeyInput.nextLine();

            System.out.print("프로젝트명: ");
            title[3] = KeyInput.nextLine();
            
            System.out.print("내용: ");
            content[3] = KeyInput.nextLine();
            
            System.out.print("시작일: ");
            startDate[3] = Date.valueOf(KeyInput.nextLine()); 
                
            System.out.print("종료일: ");
            endDate[3] = Date.valueOf(KeyInput.nextLine());

            System.out.print("만든이: ");
            created[3] = KeyInput.nextLine();
                
            System.out.print("팀원: ");
            members[3] = KeyInput.nextLine();
            
            System.out.print("계속 입력하시겠습니까? (y/N)");
            response = KeyInput.nextLine();
            
            System.out.println("");
            
            // 5번
            if (response.equalsIgnoreCase("y")) {
              count++;
              
              System.out.print("번호? ");
              num[4] = KeyInput.nextInt();
              KeyInput.nextLine();

              System.out.print("프로젝트명: ");
              title[4]= KeyInput.nextLine();
              
              System.out.print("내용: ");
              content[4] = KeyInput.nextLine();
              
              System.out.print("시작일: ");
              startDate[4] = Date.valueOf(KeyInput.nextLine()); 
                  
              System.out.print("종료일: ");
              endDate[4] = Date.valueOf(KeyInput.nextLine());

              System.out.print("만든이: ");
              created[4] = KeyInput.nextLine();
                  
              System.out.print("팀원: ");
              members[4] = KeyInput.nextLine();
              
              System.out.print("계속 입력하시겠습니까? (y/N)");
              response = KeyInput.nextLine();
              
              System.out.println("");
            }
          }
        }
      }
        
    KeyInput.close();
    
    System.out.println("--------------------------------------");
    
    
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num[0], title[0], content[0], startDate[0].toString(), endDate[0].toString(), created[0], members[0]);
    if(count > 1) {
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num[1], title[1], content[1], startDate[1].toString(), endDate[1].toString(), created[1], members[1]);
      if(count > 2) {
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num[2], title[2], content[2], startDate[2].toString(), endDate[2].toString(), created[2], members[2]);
        if(count > 3) {    
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num[3], title[3], content[3], startDate[3].toString(), endDate[3].toString(), created[3], members[3]);
          if(count > 4) {
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num[4], title[4], content[4], startDate[4].toString(), endDate[4].toString(), created[4], members[4]);
          }
        }
      }
    }
  }
}
