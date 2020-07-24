package com.eomcs.basic.ex04;

public class Exam0441 {
  
  public static void main (String[] args) {
    
    boolean b1, b2;
    // 논리 값을 담을 변수는 JVM내부에서 4바이트 크기의 int 타입 메모리를 사용한다.
    
    b1 = true; // 실제 메모리에는 1을 저장 
    b2 = false; // 실제 메모리에는 0을 저장 
    
    System.out.println(b1);
    System.out.println(b2);
    // JVM내부에서 1과 0으로 저장된다고 해서 직접 정수값인 1과 0으로 선언할 수는 없다.
    
//    b1 = 1;
//    b2 = 0;
    
  }

}
