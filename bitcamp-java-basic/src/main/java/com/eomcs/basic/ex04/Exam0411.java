package com.eomcs.basic.ex04;

public class Exam0411 {

  public static void main(String[] args) {
    
    byte b;
    // byte는 8비트로 음수까지 포함하여 -128 ~ 127까지 표현 가능하다.
    
    b = -128;
    b = 127;
    
//    b = -129;
//    b = 128; 각 표현 범위를 넘어섰으므로 컴파일 에러
    
    short s;
    // short는 16비트로 음수까지 포함하여 -32768 ~ 32767까지 표현 가능하다.
    
    s = -32768;
    s = 32767;
    
//    s = -32769;
//    s = 32768; 표현 범위를 넘어섰으므로 컴파일 에러
    
    int i;
    
    i = -2147483648;
    i = 2147483647;
    
    long l;
    
    l = -9223372036854775808L;
    l = 9223372036854775807L;
  }
}
