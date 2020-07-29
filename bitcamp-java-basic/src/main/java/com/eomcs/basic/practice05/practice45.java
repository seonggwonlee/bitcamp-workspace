package com.eomcs.basic.practice05;

public class practice45 {

  public static void main (String[] args) {
    
    int i = 2;
    i = ++i;
    
    i = 3;
    // ++i를 통해 i값은 이미 3이므로 쓸데없는 코드이다.
    System.out.println(i);
  }
}
