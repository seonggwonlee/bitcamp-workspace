package com.eomcs.basic.ex04;

public class Exam0310 {

  public static void main(String[] args) {
    
    // 변수의 사용
    int age = 20;
    
    System.out.println(age);
    
    age = 30;
    
    System.out.println(age);
    
    int num;
    
    // System.out.println(num); 메모리는 확보했지만 값을 초기화하지 않아 사용 불가 - 컴파일 오류
    
    int x;
    // x = num; 컴파일 오류
    
    int y;
    System.out.println(y); // 변수 값 초기화를 먼저 해야함. 
    y = 100;
  }
}
