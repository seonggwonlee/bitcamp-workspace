package com.eomcs.basic2.ex04;

public class Exam0550 {
  public static void main(String[] args) {
    int[] arr1;
    arr1 = new int[5];

    int[] arr2 = arr1;
    // 특정 배열의 레퍼런스 주소를 담을 수 있다.

    arr2[0] = 100;
    // arr2와 arr1은 같은 주소를 가리킨다.

    System.out.println(arr1[0]);
  }
}
