package com.eomcs.basic.ex05;

//# 산술 연산자 : +, -, *, /, %
//
public class Exam0110 {
  public static void main(String[] args) {
    System.out.println(100 + 27);
    System.out.println(100 - 27);
    System.out.println(100 * 27);
    System.out.println(100 / 27); // 정수와 정수의 연산 결과는 무조건 정수 (소수점 이하는 잘림)
    System.out.println(100 % 27); // 나눈 나머지 
  }
}