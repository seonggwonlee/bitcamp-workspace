package com.eomcs.basic.practice05;

public class practice25 {

  public static void main(String[] args) {
    
    int a = -0x7f_ff_ff_fa;
    // -21_4748_3642
    // 10000000_00000000_00000000_00000110
    
    System.out.println(a);
    System.out.println(a << 1);
    //  [10000000_00000000_00000000_00000110] = -21_4748_3642
    // 1[0000000_00000000_00000000_000001100] = 12
    
    System.out.println(a << 2);
    System.out.println(a << 3);
    System.out.println(a << 4);
    
    // 위와 마찬가지로 음수의 정수를 비트 이동 시키면 양수로 바뀔 수 있다.
    // 왼쪽으로 x 만큼 비트 이동시키는 것은 주어진 양수에 대해 2**x로 곱한것과 같다.
  }
}
