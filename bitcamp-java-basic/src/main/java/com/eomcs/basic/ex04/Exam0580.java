package com.eomcs.basic.ex04;

public class Exam0580 {
  
  public static void main(String[] args) {
    
    int[] arr1;
    arr1 = new int[5];
    arr1[0] = 100;
    
    arr1 = new int[] {200, 200, 200};
    // arr1 레퍼런스에 다른 배열 인스턴스 주소 기입
    // 이렇게 하면 arr1이 보관하고 있던 인스턴스를 잃어버렸기 때문에 해당 인스턴스를 이용할 수 없다.
    // 이런 인스턴스를 가비지(Garbage)라고 부른다.
    
    System.out.println(arr1[0]);
    // 새 배열의 인스턴스 값 출력
    
    
  }

}
