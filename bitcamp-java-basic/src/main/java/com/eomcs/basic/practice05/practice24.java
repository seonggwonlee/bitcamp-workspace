package com.eomcs.basic.practice05;

public class practice24 {

  public static void main(String[] args) {
    
    // 비트 이동 연산자 (>>, >>>, <<)
    // << 연산자는 비트를 왼쪽으로 이동시킨다.
    // 이동되고 남은 빈자리는 0으로 채운다.
    // 경계를 넘어간 비트는 버려진다.
    
    int i = 1;
    
    System.out.println(i << 1);
    System.out.println(i << 2);
    System.out.println(i << 3);
    System.out.println(i << 4);
    
    i = 0b0000_1011;
    System.out.println(i << 1);
    System.out.println(i << 2);
    System.out.println(i << 3);
    
    String s1 = "abc";
    String s2 = "가나다";
    String s3 = "a나c";
    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s3.length());
    
  }
}
