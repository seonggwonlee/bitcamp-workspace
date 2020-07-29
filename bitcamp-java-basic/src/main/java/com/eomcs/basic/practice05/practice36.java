package com.eomcs.basic.practice05;

public class practice36 {

  public static void main (String[] args) {
    
    int i = 2;
    
    i++; // i => 3
    
    System.out.println(i);
    System.out.println(i++);
    System.out.println(i);
    
    // 증감 연산자는 코드를 간략화 시킬 수 있다.
    // ex) i = i + 1 => i++
    
    // i++ 의 의미는 현재 위치에 i 메모리에 들어있는 값을 먼저 꺼낸다.
    // 그 후 i 메모리의 값을 1 증가 시킨다.
    // 쉽게 생각해 해당 문장의 연산을 먼저 수행한 후 1을 증가시킨다.
    
  }
}
