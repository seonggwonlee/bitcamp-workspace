package com.eomcs.basic.practice05;

public class practice28 {

  public static void main(String[] args) {
    
    int i = 0b11111111_11111111_11111111_10101001;
    
    System.out.println(i);
    
    System.out.println(i >> 1);
    System.out.println(i >> 2);
    System.out.println(i >> 3);
    System.out.println(i >> 4);
    
    // 음수 정수일 경우 오른쪽으로 비트 이동 시
    // 빈자리는 1로 채운다.
    // 음수 값에 대한 비트 이동은 2**n으로 나눈 것과 같다.
    // 그리고 소수점이 존재할 경우 그 소수점바로 밑 정수 값이 결과가 된다.
  }
}
