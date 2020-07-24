package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;
// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.


// 1) 낱개의 변수를 사용하여 여러 회원 정보 입력받아 처리하기
// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하기 (조건문 필요)
// 3) 배열을 사용하여 여러 개의 값을 다루기
// - 배열을 사용하면 간단하게 여러 개의 변수를 선언할 수 있다.
// 4) 반복문을 사용하여 여러 개의 값 다루기
// - 반복문 사용시 같은 코드를 중복해서 작성할 필요가 없다.
// 5) 배열 개수를 변수에서 관리하기
// - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있다.
// 6) 상수를 사용하여 초기 값을 변경하지 못하게 하기
// - 변수는 중간에 값을 바꿀 수 있기 때문에 그렇지 말아야 할 경우에 대비한다.
//   
public class App_f {

  public static void main(String[] args) {
    
    Scanner KeyInput = new Scanner(System.in);
    
    // 최대 5명의 회원 정보를 입력 받는 변수 선언
    
    int[] no = new int[5];
    int count = 0;
    final int MAX_LENGTH = 5; // final로 변경하지 못하게하면서 상수변수를 대문자로 작성하여 식별가능하게
    
    String[] name = new String[MAX_LENGTH]; // []안에 있는 숫자 = 배열 index
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    
    Date[] now = new Date[MAX_LENGTH];
    
    long currentMillis = 0;
        
    for (int i=0; i < MAX_LENGTH; i++) {
      count++;
      
      System.out.print("번호? ");
      no[i] = KeyInput.nextInt(); // 위치를 가리킬 때는 0부터
      KeyInput.nextLine(); 
      
      System.out.print("이름? ");
      name[i] = KeyInput.nextLine();
      
      System.out.print("이메일? ");
      email[i] = KeyInput.nextLine();
      
      System.out.print("암호? ");
      password[i] = KeyInput.nextLine();
      
      System.out.print("사진? ");
      photo[i] = KeyInput.nextLine();
      
      System.out.print("전화? ");
      tel[i] = KeyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
      now[i] = new Date(currentMillis);
      
      System.out.println(); // 빈 줄(엔터효과)
      
      System.out.print("계속 입력하시겠습니까? (y/N) ");
      String response = KeyInput.nextLine();
      
      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문 중
      }
      
    }
    
//    if (response.equals("y") || response.equals("Y")) {
//      count = count + 1;
//      
//      // 2번 회원 입력    
//      System.out.print("번호? ");
//      // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
//      no[1] = KeyInput.nextInt(); 
//      KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
//      //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
//      
//      System.out.print("이름? ");
//      name[1] = KeyInput.nextLine();
//      
//      System.out.print("이메일? ");
//      email[1] = KeyInput.nextLine();
//      
//      System.out.print("암호? ");
//      password[1] = KeyInput.nextLine();
//      
//      System.out.print("사진? ");
//      photo[1] = KeyInput.nextLine();
//      
//      System.out.print("전화? ");
//      tel[1] = KeyInput.nextLine();
//      
//      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
//      now[1] = new Date(currentMillis);
//      
//      System.out.println(); // 빈 줄(엔터효과)
//      
//      System.out.print("계속 입력하시겠습니까? (y/N) ");
//      response = KeyInput.nextLine();
//      
//      if (response.equalsIgnoreCase("y")) {
//        count = count + 1;
//        
//        // 3번 회원 입력     
//        System.out.print("번호? ");
//        // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
//        no[2] = KeyInput.nextInt(); 
//        KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
//        //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
//        
//        System.out.print("이름? ");
//        name[2] = KeyInput.nextLine();
//        
//        System.out.print("이메일? ");
//        email[2] = KeyInput.nextLine();
//        
//        System.out.print("암호? ");
//        password[2] = KeyInput.nextLine();
//        
//        System.out.print("사진? ");
//        photo[2] = KeyInput.nextLine();
//        
//        System.out.print("전화? ");
//        tel[2] = KeyInput.nextLine();
//        
//        currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
//        now[2] = new Date(currentMillis);
//        
//        System.out.println(); // 빈 줄(엔터효과)
//        
//        System.out.print("계속 입력하시겠습니까? (y/N) ");
//        response = KeyInput.nextLine();
//        
//        if (response.equalsIgnoreCase("y")) {
//          count += 1;
//          
//          // 4번 회원 입력 
//          System.out.print("번호? ");
//          // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
//          no[3] = KeyInput.nextInt(); 
//          KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
//          //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
//          
//          System.out.print("이름? ");
//          name[3] = KeyInput.nextLine();
//          
//          System.out.print("이메일? ");
//          email[3] = KeyInput.nextLine();
//          
//          System.out.print("암호? ");
//          password[3] = KeyInput.nextLine();
//          
//          System.out.print("사진? ");
//          photo[3] = KeyInput.nextLine();
//          
//          System.out.print("전화? ");
//          tel[3] = KeyInput.nextLine();
//          
//          currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
//          now[3] = new Date(currentMillis);
//          
//          System.out.println(); // 빈 줄(엔터효과)
//          
//          System.out.print("계속 입력하시겠습니까? (y/N) ");
//          response = KeyInput.nextLine();
//          
//          if (response.equalsIgnoreCase("y")) {
//            count++;
//            
//            // 5번 회원 입력 
//            System.out.print("번호? ");
//            // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
//            no[4] = KeyInput.nextInt(); 
//            KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
//            //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
//            
//            System.out.print("이름? ");
//            name[4] = KeyInput.nextLine();
//            
//            System.out.print("이메일? ");
//            email[4] = KeyInput.nextLine();
//            
//            System.out.print("암호? ");
//            password[4] = KeyInput.nextLine();
//            
//            System.out.print("사진? ");
//            photo[4] = KeyInput.nextLine();
//            
//            System.out.print("전화? ");
//            tel[4] = KeyInput.nextLine();
//            
//            currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
//            now[4] = new Date(currentMillis);
//            
//            System.out.println(); // 빈 줄(엔터효과)
//            }
//          }
//        }
//      } // if 조건문의 끝
    
    
        
    KeyInput.close();
        
    System.out.println("-------------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", 
          no[i], name[i], email[i], password[i], photo[i], tel[i], now[i].toString());
      }
//    if (count > 1) {
//      System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no[1], name[1], email[1], password[1], photo[1], tel[1], now[1].toString());
//      if (count > 2) {
//        System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no[2], name[2], email[2], password[2], photo[2], tel[2], now[2].toString());
//        if (count > 3) {
//          System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no[3], name[3], email[3], password[3], photo[3], tel[3], now[3].toString());
//            if (count > 4) {
//            System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", no[4], name[4], email[4], password[4], photo[4], tel[4], now[4].toString());
//          }
//        }
//      }
//    }
  }
}
