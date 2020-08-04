package com.eomcs.basic.ex07_1;

public class Exam0320 {
// call by reference

  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n"  , arr[0], arr[1]);
  }
  public static void main(String[] args) {
    int[] arr = new int[] {100, 200};
    swap(arr); // 배열 인스턴스의 주소값을 swap에 넘긴다.
    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }
}
