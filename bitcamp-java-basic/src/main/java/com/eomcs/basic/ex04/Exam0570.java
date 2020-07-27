package com.eomcs.basic.ex04;

public class Exam0570 {

  public static void main (String[] args) {
    
    int[] arr1 = new int[5];
    
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
    // 배열 메모리를 특정 값으로 초기화
    
    int arr2[] = new int[] {100, 90, 80, 70, 60};
    // 배열 선언 + 초기화를 한꺼번에 할 수 있다. 단 배열의 개수를 지정할 순 없다.
    
    int arr3[] = {0, 0, 0, 0, 0};
    // new 명령어를 생략할 수 있다. 그러나 배열 변수를 먼저 선언한 후 따로 초기화시에는 불가하다.
    // int[] arr4;
    // arr4 = {0,0,0,0,0} ==> 불가
    
    int[] arr5;
    arr5 = new int[] {0, 0, 0, 0, 0}; // ==> 가능하다.
    
  }
}
