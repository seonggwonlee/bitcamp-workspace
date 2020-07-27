package com.eomcs.basic.ex04;

public class Exam0530 {

  public static void main (String[] args) {
    
    int[] arr1 = new int[5];
    // arr1은 배멸 메모리의 주소를 담는 변수 => 레퍼런스
    
    // new int[5] 
    // - 사용할 메모리 확보 명령어, 5개의 연속된 int 타입의 메모리 준비하라는 명령어
    // - 인스턴스라고 칭한다.
    
    // new 명령어는 메모리를 확보하라는 명령어다.
    // - 리턴값은 확보된 메모리의 시작 주소이다.
    
    arr1 = new int[5];
    
    arr1[0] = 100; // arr1에 저장된 주소로 찾아가서 0번째 항목의 값을 넣어
    arr1[1] = 200; // arr1에 저장된 주소로 찾아가서 1번째 항목의 값을 넣어
    
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    
    
    
        
  }
}
