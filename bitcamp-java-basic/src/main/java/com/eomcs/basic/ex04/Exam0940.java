package com.eomcs.basic.ex04;

public class Exam0940 {
  
  public static void main(String[] args) {
    
    byte b = 100;
    short s = 100;
    int i = 100;
    long l = 100;
    
    // 큰 메모리에서 작은 메모리로 저장할 경우 값이 충분히 들어갈 수 있다면 형변환으로 가능하다.
    
    // 1) 값이 충분할 경우
    byte b2 = (byte)s;
      System.out.println(b2); // 새로운 byte변수를 선언한 이유는 byte보다 큰 메모리값의 값이 새로운 byte변수에 들어갈 수 있는지 확인하기 위해 
      
    b2 = (byte)i;
      System.out.println(b2);
      
    b2 = (byte)l;
      System.out.println(b2);
      
    // 2) 큰 메모리의 값이 작은 메모리에 들어갈 수 없는 경우
    int i2 = 0b0000_0000_0000_0000_0000_0001_0010_1100; // 300(10진수)
    b2 = (byte) i2;
    System.out.println(b2);
    
    
//    l = 400_0000_0000L;
//    i = (int)l;
//    System.out.println(l);
//    System.out.println(0x502f9000);
      
      
    
    
    
  }

}
