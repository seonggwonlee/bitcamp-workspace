package com.eomcs.basic.practice05;

public class practice29 {

  public static void main(String[] args) {
    
    int i = 0b01101001;
        
    System.out.println(i);
    
    System.out.println(i >>> 1);
    System.out.println(i >>> 2);
    System.out.println(i >>> 3);
    System.out.println(i >>> 4);
    
    // >>> 비트 이동 연산자는 오른쪽으로 비트 이동은 같다.
    // 빈자리는 음수, 양수 상관없이 0으로 채운다.
    // 오른쪽 경계를 넘어간 비트는 버려진다.
    
  }
}
