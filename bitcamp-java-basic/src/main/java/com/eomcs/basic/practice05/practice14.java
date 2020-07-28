package com.eomcs.basic.practice05;

public class practice14 {
  
  public static void main(String[] args) {
    
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);
    
    // AND 연산자 : 두 개의 논리 값이 모두 참일 때 결과가 참이다.
    
    System.out.println("------------------------");
    
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
    
    // OR 연산자 : 두 개의 논리 값 중 한 개라도 참이면 결과는 참이다.
    
    System.out.println("------------------------");
    
    System.out.println(!true);
    System.out.println(!false);
    
    // NOT 연산자 : true는 false로 false는 true로 바꾼다.
    
    System.out.println("------------------------");
    
    System.out.println(true ^ true);
    System.out.println(false ^ false);
    System.out.println(true ^ false);
    
    // exclusive OR (XOR) 연산자 
    // 배타적 비교 연산자라고 불리우며 두 개의 값이 다른 경우만 참이다.
    
    }

}
