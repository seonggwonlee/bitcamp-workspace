package com.eomcs.basic.ex04;

public class Exam0412 {

  public static void main(String[] args) {
    
    byte b;
    short s;
    
    b = 127; // 정수값 4바이트 리터럴이지만 1바이트 메모리 범위 값이므로 저장 가능 
    s = 32767; // 정수값이 4바이트 리터럴이지만 2바이트 메모리 범위 값이므로 저장 가능
    
    // b = 127L; L을 붙이면 8바이트 리터럴이기 때문에 그 이하 메모리값에 저장할 수 없다.
  }
}
