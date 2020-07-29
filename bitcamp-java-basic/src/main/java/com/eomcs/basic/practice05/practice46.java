package com.eomcs.basic.practice05;

public class practice46 {

  public static void main(String[] args) {
    
    int i = 2;
    int result = ++i + ++i * ++i;
    
    System.out.println(result);
    
    // 연산 우선순위로 인해
    // 전위 연산자가 먼저 계산된다.
  }
}
