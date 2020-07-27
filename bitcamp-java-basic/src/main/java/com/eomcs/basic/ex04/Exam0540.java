package com.eomcs.basic.ex04;

public class Exam0540 {
  
  public static void main(String[] args) {
    
    int[] arr1;
    // 배열 레퍼런스만 따로 선언 가능
    // 배열 인스턴스 생성하지 않은 상태에서는 사용 불가 
    
    arr1 = new int[5];
    // 배열 인스턴스 생성 
    
    arr1[0] = 100;
    // 배열 인스턴스에 값 저장
    
    System.out.println(arr1[0]);
    
  }
}
