package com.eomcs.basic2.ex04;

public class Exam0560 {
  public static void main(String[] args) {
    int v;

    int[] arr1 = new int[5];
    float[] arr2 = new float[5];
    boolean[] arr3 = new boolean[5];
    char[] arr4 = new char[5];
    Object[] arr5 = new Object[5];

    System.out.println(arr1[0]);
    System.out.println(arr2[0]);
    System.out.println(arr3[0]);
    System.out.println(arr4[0]);
    System.out.println(arr5[0]);
    }
}

// 일반 변수는 초기화하지 않는다면 사용할 수 없다.
// 그러나 배열은 초기화를 따로 하지 않아도, 기본 값으로 초기화가 이루어진다.
// 왜냐하면 new 명령어로 생성된 인스턴스이기 때문이다.
