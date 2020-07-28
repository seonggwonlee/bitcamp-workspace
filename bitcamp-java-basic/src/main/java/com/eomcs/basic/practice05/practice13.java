package com.eomcs.basic.practice05;

public class practice13 {

  public static void main(String[] args) {
    
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1 * f2 == 0.01f);
    // 0.1을 서로 곱하면 0.01이 되는 것이 일반적이지만
    // 프로그래밍 세계에서 부동소수점 연산은 정확한 값이 나오기 쉽지 않다.
    // 따라서 위 결과값은 false가 된다.
    
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
    System.out.printf("%f\n", Float.POSITIVE_INFINITY);
    
    
    
  }
}
