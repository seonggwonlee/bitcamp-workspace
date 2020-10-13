package com.eomcs.basic2.ex04;

public class Exam0580 {
  public static void main(String[] args) {

    int[] arr1;
    arr1 = new int[5];

    arr1[0] = 100;

    arr1 = new int[] {200, 200, 200};
    // arr1에 다른 레퍼런스 배열 주소를 기입하였다.
    // 기입 가능하나, 이렇게 되면 원래 있던 인스턴스 주소는 잃어버리게 된다.
    // 해당 주소는 가비지가 된다.

    System.out.println(arr1[0]);
    // 기존의 100은 없어지고 새로운 값인 200이 출력된다.

  }
}
