package com.eomcs.basic.practice05;

public class practice40 {

  public static void main (String[] args) {
    
    int i = 2;
    
    ++i;
    ++i;
    
    System.out.println(i);
    System.out.println(++i);
    System.out.println(i);
    
    // 전위 연산자는 먼저 i = i + 1을 수행 후 i 메모리의 그 값을 놓는다.
  }
}
