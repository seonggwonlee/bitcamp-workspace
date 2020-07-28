package com.eomcs.basic.practice05;

public class practice03 {
  
  public static void main(String[] args) {
    
    byte b;
    b = 5;
    b = 6;
    // 리터럴인 5와 6은 (순수한 5와 6) 기본 4바이트 크기
    // byte는 -127 ~ 127 까지이므로 byte 크기 안에 들어가기 때문에 저장 가능하다.
    
    b = 5 + 6;
    // 리터럴끼리 산술 연산한 결과도 리터럴로 간주한다.
    // 단 그 결과 값이 변수의 범위 내여야만 허락한다.
    
    System.out.println(b);
    // 리터럴은 컴파일 단계에서 그 값이 얼마인지 확인가능하다.
    // 변수는 해당 변수에 어떤 값이 올지 모르기 때문에 컴파일 단계에서 값을 확인할 수 없다.
    
    byte x = 5, y = 6, z;
    z = x;
    z = y;
    
    // z = x + y; => 컴파일 오류
    // 정수 변수에 대해 산술 연산 수행시 최소 4바이트로 연산한다.
    // z는 byte로 선언되어 1바이트이고 연산 단위는 4바이트로 하기 때문에
    // 큰 메모리 => 작은 메모리로 저장이 안되어 컴파일 오류 발생
    
    short s1 = 5;
    short s2 = 6;
    short s3;
    
    s3 = s1;
    s3 = s2;
    // s3 = s1 + s2; => 컴파일 오류
    // 위와 같은 이유
    
    int s4 = s1 + s2;
    System.out.println(s4);
    // s1, s2는 short 변수로 2바이트지만 연산 수행시 4바이트로 수행하기 때문에
    // int 변수인 s4에 저장할 수 있다.
    
    
    // 정수를 다룰 때에는 int 사용하는 것이 편하다.
  }

}
