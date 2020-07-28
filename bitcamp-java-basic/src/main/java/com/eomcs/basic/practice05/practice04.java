package com.eomcs.basic.practice05;

public class practice04 {

  public static void main(String[] args) {
    
    System.out.println(5.75 % 0.24);
    // System.out.println(true % false);
    // System.out.println(true + true);
    // boolean타입은 산술 연산 불가
    
    System.out.println("Hello" + "world");
    // 문자열에 사용되는 + 연산자는 문자열을 서로 이어주는 용도로 사용된다.
    
    // System.out.println("Hello" - "o"); => 컴파일 오류
    // System.out.println("Hello" * 5); => 컴파일 오류 
    // 문자열에선 다른 + 의외 연산자 사용 불가
    
    System.out.println(true && true);
    // System.out.println(10 && 10); => 컴파일 오류(정수이기 때문에)
    // 논리 연산자의 피연산자는 반드시 boolean 타입이어야 한다.
  }
}
