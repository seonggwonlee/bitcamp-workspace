package com.eomcs.basic.ex04;

public class Exam0560 {

  public static void main (String[] args) {
    
    int v;
    // 일반 변수 선언시 값 초기화 하지 않으면 사용할 수 없다.
    
    // 하지만 new 명령으로 확보된 메모리는 메모리 타입과 상관없이 기본 값으로 자동 초기화된다.
    // 따라서 배열 메모리도 동일하다.
    
    int[] arr1 = new int[5];
    float[] arr2 = new float[5];
    boolean[] arr3 = new boolean[5];
    char[] arr4 = new char[5];
    Object[] arr5 = new Object[5];
    
    System.out.println(arr1[0]); // 정수의 초기값 0
    System.out.println(arr2[0]); // 부동소수점 초기값 0.0
    System.out.println(arr3[0]); // 논리 초기값 false
    System.out.println(arr4[0]); // 문자 초기값 \u0000
    System.out.println(arr5[0]); // 주소 초기값 null
    
    
  }
}
