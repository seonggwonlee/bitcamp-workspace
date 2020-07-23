// 변수 선언
//  - 데이터를 저장할 메모리를 확보하는 명

package com.eomcs.basic.ex04;

public class Exam0110 {
  
  public static void main(String[] args) {
    
    int i;  // 정수 값을 담을 변수 선언 (메모리를 확보)
    int i2;
    int i3;
    
    int x, y, z;
    
    i = 100;
    x = i;
    y = i * x;
    
    byte b1;
    byte b2;
    
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; // b1의 값
    
    i = b1; // [000000000000000000000001100] 적은 메모리의 변수를 큰 메모리로 옮길 경우 빈 값은
            // 0으로 채워진다.
    
    // b2 = i;
    b2 = (byte)i; // 큰 메모리의 변수를 작은 메모리로 옮기는 것은 옳지 않다. 강제로 옮길 순 있으나
                  // 추천하지 않는다.
    
    int a = 100;
    int b = 200;
    
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10; // 00001010
    xx = 12; // 00001100
    xx = 78; // 01001110
  }

}

/*
 * 데이터 타입
 * 1) 정수 
 *  - byte (1byte)
 *  - short (2byte)
 *  - int (4byte)
 *  - long (8byte)
 * 
 * 2) 부동소수점
 *  - float (4byte)
 *  - double (8byte)
 * 
 * 3) 문자
 *  - char (2byte)
 *  - boolean (4 또는 1byte) => 배열에서 사용시 1byte
 *  
 *  까지 Primitive type (자바 기본(원시) 데이터 타입)
 */
