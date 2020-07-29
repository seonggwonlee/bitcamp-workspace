package com.eomcs.basic.practice05;

public class practice39 {

  public static void main (String[] args) {
    
    // 후위 증감 연산자 응용
    
    int i = 2;
    int result = i++ + i++ * i++;
    
    System.out.println(i);
    System.out.println(result);
    System.out.printf("i : %d, result : %d\n", i, result);
    
    // 연산자 우선순위
    // ++, -- 가 최우선순위
    // 그 후 *, /, %이다.
    // 따라서 위 문장은 ++을 먼저 연산 후 다른 연산을 실행한다.
  }
}
