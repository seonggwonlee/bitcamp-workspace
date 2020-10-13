package com.eomcs.basic2.ex04;

public class Exam0570 {
  public static void main(String[] args) {
    int[] arr1 = new int[5];

    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;

    int arr2[] = new int[] {100, 90, 80, 70, 60};
    // 배열과 선언을 한꺼번에 할 수 있다.

    int arr3[] = {0, 0, 0, 0, 0};
    // new 명령어 역시 생략 가능하다. 하지만 인스턴스를 따로 생성할 시에는 불가능하다.

    int[] arr4;
    arr4 = new int[] {1, 2, 3, 4, 5}; // 가능하다.

  }
}
