package com.eomcs.basic.practice05;

public class practice09 {

  public static void main(String[] args) {
    
    float r1 = 5 / 2 + 3.1f;
    System.out.println(r1);
    
    float r2 = 3.1f + 5 / 2;
    System.out.println(r2);
    
    // 연산 우선 순위에 따라 연산 수행시 바로 암시적 형변환이 이루어진다.
    // 모든 값을 최종 결과 타입으로 변환 후 계산하지는 않는다.
  }
}
