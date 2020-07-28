package com.eomcs.basic.practice05;

public class practice20 {

  public static void main(String[] args) {
    
    int data = 0b1111_1001_0111_1111;
    System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000));
  }
}
