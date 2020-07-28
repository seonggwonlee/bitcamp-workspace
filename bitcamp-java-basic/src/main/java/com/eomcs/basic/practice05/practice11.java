package com.eomcs.basic.practice05;

public class practice11 {

  public static void main (String[] args) {
    
    int a = 10;
    int b = 20;
    
    boolean r1 = a < b;
    // 해당값의 결과는 boolean 이므로 정수 타입에 저장할 수 없다.
    // true 또는 false로 결과값 출력
    
    // int r2 = a < b; => 컴파일 오류
    
    System.out.println(a < b);
    System.out.println(r1);
    System.out.println(a <= b);
    System.out.println(a > b);
    System.out.println(a >= b);
    System.out.println(a == b);
    System.out.println(a != b);
        
  }
}
