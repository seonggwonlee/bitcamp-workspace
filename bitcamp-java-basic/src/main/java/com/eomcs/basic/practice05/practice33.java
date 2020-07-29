package com.eomcs.basic.practice05;

public class practice33 {

  public static void main (String[] args) {
    
    // 한 개의 정수 값에 여러 개의 정보 저장하기
    // => 비트의 1 또는 0을 이용하여 정보 표현
    
    // 특정 비트 설정 시 변수 선언하여 설정하는 것이 좋다.
    // 조회용으로 사용할 변수이므로 상수로 선언하는 것이 좋다.
    
    final int CSS           = 0x01;
    final int HTML          = 0x02;
    final int PHP           = 0x04;
    final int Python        = 0x08;
    final int JAVASCRIPT    = 0x10; // 0001 0000
    final int JAVA          = 0x20; // 0010 0000
    final int CPP           = 0x40; // 0100 0000
    final int C             = 0x80; // 1000 0000
    
    int lang = C | JAVA | Python | HTML;
    
    System.out.println(Integer.toBinaryString(lang));
  }
}
