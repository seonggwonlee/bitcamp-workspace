package com.eomcs.basic.practice05;

public class practice07 {

  public static void main (String[] args) {
    
    float f1 = 987.6543f;
    float f2 = 1.111111f;
    System.out.println(f1);
    System.out.println(f2);
    
    float r1 = f1 + f2;
    System.out.println(r1);
    // float 끼리의 산술 연산이므로 결과값이 float이다.
    // 즉 최대 7자리까지 표현할 수 있으며 유효자릿수를 초과하는 값은 버려진다.
    
    
    double r2 = f1 + f2;
    System.out.println(r2);
    // 산술연산결과의 타입은 이미 float으로 정해진 상태에서
    // double변수에 저장하기 때문에 값이 왜곡된다.
    // float 변수보다 자릿수가 많아진 거 IEEE 754 이진수 변환 문제 때문이다.
    
    double d1 = 987.6543;
    double d2 = 1.111111;
    double r5 = d1 + d2;
    System.out.println(r5);
    // int타입으로 출력하지 못할 유효자릿수를 가진 값이라면 처음부터 double을 써야한다.
    // 실제 출력값 뒤에 000001이 붙는 것은 이진수 변환 문제이다.
    
    
  }
}
