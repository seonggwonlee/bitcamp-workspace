package com.eomcs.basic.practice05;

public class practice48 {

  public static void main(String[] args) {
    
    // 전위, 후위 연산자는 리터럴값에는 적용할 수 없다.
    
//    int x = ++100; 컴파일 오류
//    x = 100++; 컴파일 오류 
    
    
    int y = 100;
    // 전위, 후위 연산자는 변수에 동시 적용할 수 없다.
    
//    ++y++;
//    (++y)++;
//    ++(y++); 컴파일 오류     
  }
}
