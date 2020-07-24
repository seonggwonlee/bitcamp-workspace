package com.eomcs.basic.ex04;

public class Exam0433 {

  public static void main (String[] args) {
    
    char c = 'A';
    System.out.println(c);
    // 문자 : UCS-2 코드에 의해 정의된 코드를 리턴한다.
    
    int i = 'A';
    System.out.println(i);
    // 따라서 해당 문자의 코드를 정수로 알고 싶다면 int 사용한다.
    
    float f = '헐';
    System.out.println(f);
    
    double d = '랭';
    System.out.println(d);
  }
}
