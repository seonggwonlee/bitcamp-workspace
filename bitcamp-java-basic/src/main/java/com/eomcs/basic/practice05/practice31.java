package com.eomcs.basic.practice05;

public class practice31 {
  
  public static void main (String[] args) {
    
    int i = 0x27a130ff;
    int a, b, c, d;
    System.out.println(Integer.toHexString(i));
    
    a = i >> 24;
    // 00100111_10100001_00110000_11111111 = 27a130ff
    // 00000000_00000000_00000000_00100111 = i >> 24 = 00000027
    // = 27
    
    b = (i >> 16) & 0xff;
    //  00000000_0000000_00100111_10100001 = i >> 24
    //& 00000000_0000000_00000000_11111111 = 0xff
    // ---------------------------------------------
    //  00000000_0000000_00000000_10100001 = a1
    
    c = (i >> 8) & 0xff;
    d = i & 0xff;
    
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
    
    
  }
}
