package com.eomcs.basic.ex04;

//  상수 - 값을 바꿀 수 없는 변수 

public class Exam0610 {
  
  public static void main(String[] args) {
    
    int a;
    a = 100;
    a = 200;
    a = 300;
    
    // 변수의 값을 한 번 설정하면 바꾸지 못하게 막는 문법
    final int b;
    b = 100;
    // b = 200; final 문법을 사용한다면 값을 넣을 수 없다. 컴파일 오류가 출력한다.
    
    // 상수 변수는 보통 선언과 동시에 값을 저장한다.
    final int c = 100;
    // c = 200; // 100을 이미 선언 후 final하였으므로 200은 저장되지 않아 컴파일 오류 출력
    
    // 일반 변수가 아님을 표시하기 위해 대문자로 이름을 짓는다.
    final int LENGTH = 100;
    
    int firstUserName;
    final int FIRST_NAME_NAME;
    // 상수의 이름을 대문자로 작성할 때 단어 사이에 _를 삽입한다.
  }

}
