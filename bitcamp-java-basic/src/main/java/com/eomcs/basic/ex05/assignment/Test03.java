package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 다음 int 변수에 들어있는 값을 
//          다음과 같이 첫 바이트 부터 끝 바이트까지 16진수로 순서대로 출력하라.
//실행 예)
//aa
//bb
//cc
//dd
//
public class Test03 {
  
  public static void main(String[] args) {
    
    int value = 0xaabbccdd;
    int a, b, c, d;
    // 10101010 10111011 11001100 11011101
    
    System.out.println(Integer.toHexString((value >> 24) & 0xff));
    System.out.println(Integer.toHexString((value >> 16) & 0xff));
    System.out.println(Integer.toHexString((value >> 8) & 0xff));
    System.out.println(Integer.toHexString(value & 0xff));
  }
}

 