package com.eomcs.basic.practice05;

// 비트 연산자 (&, |, ^, ~)
public class practice17 {
  
  public static void main(String[] args) {
    
    int a = 0b0110_1100; // 10진수 : 108
    int b = 0b0101_0101; // 10진수 : 85
    
//    System.out.println(a && b);
//    System.out.println(a || b);
//    System.out.println(!b);
    // 정수 값에 대해서는 논리 연산자 사용할 수 없다.
    // 따라서 컴파일 오류
    
    // 논리 연산자는 쓸 수 없으나 비트 연산자는 사용가능
    // &, |, ^, ~가 있다.
    // 각 비트 단위로 연산을 수행하며 1은 참, 0은 거짓으로 계산한다.
    // 출력 결과는 정수이다.
    
    System.out.println(a & b);
    // a : 0000 0000 0000 0000 0000 0000 0110 1100
    // b : 0000 0000 0000 0000 0000 0000 0101 0101
    // ---------------------------------------------
    //     0000 0000 0000 0000 0000 0000 0100 0100
    // AND 연산자이므로 둘 다 참일 경우에만 1이다.
    // 4바이트인 이유는 자바 연산 최소 단위이기 때문 
    
    System.out.println(a | b);
    // a : 0000 0000 0000 0000 0000 0000 0110 1100
    // b : 0000 0000 0000 0000 0000 0000 0101 0101
    // --------------------------------------------
    //     0000 0000 0000 0000 0000 0000 0111 1101
    // OR 연산자이므로 둘 중 하나만 참일 경우 1이다.
    
    System.out.println(a ^ b);
    // a : 0000 0000 0000 0000 0000 0000 0110 1100
    // b : 0000 0000 0000 0000 0000 0000 0101 0101
    // ---------------------------------------------
    //     0000 0000 0000 0000 0000 0000 0011 1001
    // XOR 연산자이므로 둘 다 달라야 1이다.
    
    System.out.println(~a);
    // a : 0000 0000 0000 0000 0000 0000 0110 1100
    // --------------------------------------------
    //     1111 1111 1111 1111 1111 1111 1001 0011
    // NOT 연산자이므로 전부 반대여야 한다.
    
    
    
  }

}