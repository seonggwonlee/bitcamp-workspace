package com.eomcs.basic.ex04;

public class Exam0520 {
  
  public static void main (String[] args) {
    
    int[] arr1 = new int[5];
    
    arr1[0] = 100;
    arr1[1] = 200;
    arr1[2] = 300;
    arr1[3] = 400;
    arr1[4] = 500;
    
    System.out.printf("%d, %d, %d, %d, %d\n", arr1[0], arr1[1], arr1[2], arr1[3], arr1[4]);
    
    // 배열 메모리에 접근하여 출력
    
    // 유효하지 않은 인덱스를 지정한다면 실행 중 오류 발생한다.
    // 컴파일시에는 인덱스 유효 여부를 판단할 수 없다.
  }
}
