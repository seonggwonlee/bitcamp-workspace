package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 다음 int 변수에 들어있는 값을 
//          각 자릿수의 10진수 값을 역순으로 출력하라.
//실행 예)
// 값 : 23459876 
// 6
// 7
// 8
// 9
// 5
// 4
// 3
// 2

public class Test04a {
  
  public static void main(String[] args) {
    
    int value = 23459876;
    
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
    
    value = value / 10;
    System.out.println(value % 10);
  }
}

 