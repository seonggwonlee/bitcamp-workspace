package com.eomcs.basic.practice05;

public class practice37 {
  
  public static void main (String[] args) {
    
    int i = 7;
    
    int j = i++;
    
    System.out.println(j);
    System.out.println(i++);
    System.out.println(i);
    
    // 1) i 값에 i 메모리에 있는 값을 놓는다.
    // => j = 7
    // j = 7이다. 그러나 아직 저장할 순 없다.
    // ++연산 => i = i + 1 => 8
    // j = 7을 다시 불러와서 실행한다.
    
  }
}
