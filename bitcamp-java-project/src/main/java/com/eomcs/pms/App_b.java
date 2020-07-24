package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;
// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.


// 1) 낱개의 변수를 사용하여 여러 회원 정보 입력받아 처리하기
// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하기 (조건문 필요)
public class App_b {

  public static void main(String[] args) {
    
    Scanner KeyInput = new Scanner(System.in);
    
    // 최대 5명의 회원 정보를 입력 받는 변수 선언
    
    int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0;
    int count = 1;
    
    String name1 = "", name2 = "", name3 = "", name4 = "", name5 = "";
    String email1 = "", email2 = "", email3 = "", email4 = "", email5 = "";
    String password1 = "", password2 = "", password3 = "", password4 = "", password5 = "";
    String photo1 = "", photo2 = "", photo3 = "", photo4 = "", photo5 = "";
    String tel1 = "", tel2 = "", tel3 = "", tel4 = "", tel5 = "";
    
    Date now1 = null, now2 = null, now3 = null, now4 = null, now5 = null;
    
    long currentMillis = 0;
    
    
    
    // 1번 회원 입력 
    System.out.print("번호? ");
    no1 = KeyInput.nextInt(); 
    KeyInput.nextLine(); 
            
    System.out.print("이름? ");
    name1 = KeyInput.nextLine();
    
    System.out.print("이메일? ");
    email1 = KeyInput.nextLine();
    
    System.out.print("암호? ");
    password1 = KeyInput.nextLine();
    
    System.out.print("사진? ");
    photo1 = KeyInput.nextLine();
    
    System.out.print("전화? ");
    tel1 = KeyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
    now1 = new Date(currentMillis);
    
    System.out.println(); // 빈 줄(엔터효과)
    
    System.out.print("계속 입력하시겠습니까? (y/N) ");
    String response = KeyInput.nextLine();
    
    if (response.equals("y") || response.equals("Y")) {
      count = count + 1;
      
      // 2번 회원 입력    
      System.out.print("번호? ");
      // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
      no2 = KeyInput.nextInt(); 
      KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
      //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
      
      System.out.print("이름? ");
      name2 = KeyInput.nextLine();
      
      System.out.print("이메일? ");
      email2 = KeyInput.nextLine();
      
      System.out.print("암호? ");
      password2 = KeyInput.nextLine();
      
      System.out.print("사진? ");
      photo2 = KeyInput.nextLine();
      
      System.out.print("전화? ");
      tel2 = KeyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
      now2 = new Date(currentMillis);
      
      System.out.println(); // 빈 줄(엔터효과)
      
      System.out.print("계속 입력하시겠습니까? (y/N) ");
      response = KeyInput.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        count = count + 1;
        
        // 3번 회원 입력     
        System.out.print("번호? ");
        // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
        no3 = KeyInput.nextInt(); 
        KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
        //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
        
        System.out.print("이름? ");
        name3 = KeyInput.nextLine();
        
        System.out.print("이메일? ");
        email3 = KeyInput.nextLine();
        
        System.out.print("암호? ");
        password3 = KeyInput.nextLine();
        
        System.out.print("사진? ");
        photo3 = KeyInput.nextLine();
        
        System.out.print("전화? ");
        tel3 = KeyInput.nextLine();
        
        currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
        now3 = new Date(currentMillis);
        
        System.out.println(); // 빈 줄(엔터효과)
        
        System.out.print("계속 입력하시겠습니까? (y/N) ");
        response = KeyInput.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
          count += 1;
          
          // 4번 회원 입력 
          System.out.print("번호? ");
          // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
          no4 = KeyInput.nextInt(); 
          KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
          //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
          
          System.out.print("이름? ");
          name4 = KeyInput.nextLine();
          
          System.out.print("이메일? ");
          email4 = KeyInput.nextLine();
          
          System.out.print("암호? ");
          password4 = KeyInput.nextLine();
          
          System.out.print("사진? ");
          photo4 = KeyInput.nextLine();
          
          System.out.print("전화? ");
          tel4 = KeyInput.nextLine();
          
          currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
          now4 = new Date(currentMillis);
          
          System.out.println(); // 빈 줄(엔터효과)
          
          System.out.print("계속 입력하시겠습니까? (y/N) ");
          response = KeyInput.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            count++;
            
            // 5번 회원 입력 
            System.out.print("번호? ");
            // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
            no5 = KeyInput.nextInt(); 
            KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
            //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
            
            System.out.print("이름? ");
            name5 = KeyInput.nextLine();
            
            System.out.print("이메일? ");
            email5 = KeyInput.nextLine();
            
            System.out.print("암호? ");
            password5 = KeyInput.nextLine();
            
            System.out.print("사진? ");
            photo5 = KeyInput.nextLine();
            
            System.out.print("전화? ");
            tel5 = KeyInput.nextLine();
            
            currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
            now5 = new Date(currentMillis);
            
            System.out.println(); // 빈 줄(엔터효과)
            }
          }
        }
      } // if 조건문의 끝
    
    
        
    KeyInput.close();
    
    System.out.println("-------------------------------");
    System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no1, name1, email1, password1, photo1, tel1, now1.toString());
    if (count > 1) {
      System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no2, name2, email2, password2, photo2, tel2, now2.toString());
      if (count > 2) {
        System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no3, name3, email3, password3, photo3, tel3, now3.toString());
        if (count > 3) {
          System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no4, name4, email4, password4, photo4, tel4, now4.toString());
            if (count > 4) {
            System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no5, name5, email5, password5, photo5, tel5, now5.toString());
          }
        }
      }
    }
  }
}
