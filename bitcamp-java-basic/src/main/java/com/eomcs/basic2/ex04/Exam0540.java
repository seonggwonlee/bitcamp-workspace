package com.eomcs.basic2.ex04;

public class Exam0540 {
  public static void main(String[] args) {
    int[] arr1;
    // 배열 레퍼런스만 따로 선언 가능
    // 배열 인스턴스 생성하지 않은 상태에서는 불가

    arr1 = new int[5];
    // = int[] arr1 = new int[5];

    arr1[0] = 1;

    System.out.println(arr1[0]);

  }
}
