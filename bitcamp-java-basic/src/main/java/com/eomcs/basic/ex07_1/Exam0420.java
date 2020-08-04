package com.eomcs.basic.ex07_1;

public class Exam0420 {
// Heap메모리 영역

  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = getArray();
    System.out.println(arr[0]);
  }
}
