package com.eomcs.basic.practice05;

public class practice05 {

  public static void main (String[] args) {
    
    int i = 5;
    int j = 2; 
    float r = i / j;
    
    // 정수끼리의 산술연산은 정수값이다.
    // 정수끼리 나눈뒤 나온 소수점은 버린다.
    
    System.out.println(r);
    // r변수는 float타입이므로 소수점이 생긴다.
    
    //정확하게 하기 위해선 형변환 사용
    
    r = (float)i / (float)j;
    System.out.println(r);
    
    // i와 j를 형변환하여 임시로 float형태로 만든다.
    // 그럼 정확한 값인 2.5로 출력한다.
    // 형변환은 변수 자체의 데이터 타입이 바뀌는 것이 아닌
    // 임시적으로 그 때만 변할 수 있도록 던져주는 것
    // 그래서 type casting이라고도 한다.
    
    
    
    
  }
}
