package com.eomcs.basic.ex04;

public class Exam0551 {

  public static void main(String[] args) {
    
    int[] arr1;
    arr1 = new int[5];
    
    arr1 = null;
    // 배열 레퍼런스를 초기화한다. (null은 0으로 설정하는것)
    
    System.out.println(arr1[0]);
    // 레퍼런스가 배열 인스턴스를 가리키지 않은 상태에서 출력시 nullpointerexception출력됨.
    
  }
}
