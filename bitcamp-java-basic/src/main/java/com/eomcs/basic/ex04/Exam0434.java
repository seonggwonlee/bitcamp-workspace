package com.eomcs.basic.ex04;

public class Exam0434 {
  
  public static void main (String[] args) {
    
    // 자바는 문자 저장시 UCS-2 코드를 사용한다.
    // 어떤 문자가 어떤 코드를 사용하는지 알고싶을 땐 ''연산자나 char 변수 사용한다.
    int a = 0x41;
    // A의 UCS-2코드 
    
    
    for (int i = 0; i < 26; i++) {
      System.out.println((char)(a + i));
      // A 코드부터 +1하면서 그 이후 알파벳을 차례대로 출력
      // 여기서 char 선언하지 않는다면 정수값 그대로 출력한다.
    }
  }

}
