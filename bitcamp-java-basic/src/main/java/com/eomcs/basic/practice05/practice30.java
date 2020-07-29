package com.eomcs.basic.practice05;

public class practice30 {

  public static void main (String[] args) {
    
    int i = 0b11111111_11111111_11111111_10101001; 
        
        System.out.println(i >>> 1);
        System.out.println(i >>> 2);
        System.out.println(i >>> 3);
        System.out.println(i >>> 4);
        
    // 왼쪽 빈자리는 0으로 채운다.
    // 소수점이 있다면 그 수보다 더 작은 바로 밑 정수값이 결과가 된다.
  }
}
