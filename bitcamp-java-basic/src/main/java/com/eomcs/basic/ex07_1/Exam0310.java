package com.eomcs.basic.ex07_1;

public class Exam0310 {
//  call by value
  public static void main(String[] args) {
   int a = 100;
   int b = 200;
   swap(a, b);
   System.out.printf("main(): a=%d, b=%d\n", a, b);
  }
  static void swap(int a, int b) {
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
}

// swap호출 시 a,b값을 넘긴다. => call by value
// swap이 a,b값을 받았지만 main메서드에 있는 a,b와 같은 변수가 아니다.
// swap에서 쓴 a,b변수의 메모리는 해당 메서드 호출이 끝날 때 사라지게된다.