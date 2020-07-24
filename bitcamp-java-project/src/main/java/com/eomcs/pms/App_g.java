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
// 7) 메서드를 사용하여 코드를 분리하기
// - 메서드를 사용하면 기능 별로 코드를 별도의 블럭으로 분리할 수 있다.
// - 작은 단위로 코드가 분리되면 관리하기 쉽다.
public class App_g {
  
  static int count = 0; // 여러 블록에서 공유하여 사용하기 때문에 main메서드 밖으로 뺴내었고, 같은 static 그룹이어야 함.
  static final int MAX_LENGTH = 5; // final로 변경하지 못하게하면서 상수변수를 대문자로 작성하여 식별가능하게
  static int[] no = new int[MAX_LENGTH];
  
  static String[] name = new String[MAX_LENGTH]; // []안에 있는 숫자 = 배열 index
  static String[] email = new String[MAX_LENGTH];
  static String[] password = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tel = new String[MAX_LENGTH];
  
  static Date[] now = new Date[MAX_LENGTH];
  
  public static void main(String[] args) {
    
    System.out.println("[회원]");
    
    InputMembers(); // 별도의 블록으로 분리한 코드 실행
    
    System.out.println("-------------------------------------------");
    
    printMembers();
  } // 메인 메서드
  
  static void InputMembers() {
    Scanner KeyInput = new Scanner(System.in);
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
     } // InputMembers 메서드 끝
    
    KeyInput.close();
  }
  static void printMembers() {
    for (int i = 0; i < count; i++) {
      System.out.printf("번호: %d, 이름: %s, 이메일: %s, 암호: %s, 사진: %s, 전화: %s, 가입일: %s\n", 
          no[i], name[i], email[i], password[i], photo[i], tel[i], now[i].toString());
      }
   } // printMembers 메서드 끝
} // class
