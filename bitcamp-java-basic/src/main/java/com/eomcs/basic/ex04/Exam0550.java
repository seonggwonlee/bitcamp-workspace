package com.eomcs.basic.ex04;

public class Exam0550 {
  
  public static void main(String[] args) {
    
    int[] arr1;
    arr1 = new int[5];
    
    int[] arr2 = arr1;
    // 특정 배열 인스턴스의 주소를 다른 레퍼런스에 담을 수 있다.
    
    arr2[0] = 100;
    // arr2와 arr1은 같은 배열 인스턴스를 가리킨다.
    
    System.out.println(arr1[0]);
    
  }

}
