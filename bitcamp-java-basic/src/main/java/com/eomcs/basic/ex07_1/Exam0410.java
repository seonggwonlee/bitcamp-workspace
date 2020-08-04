package com.eomcs.basic.ex07_1;

public class Exam0410 {

  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\n", a, b);
  }
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
  // JVM의 메모리 관리 중 Stack은 LIFO이다.
  // 메소드 호출을 하고 실행 완료시 호출한 메서드 메모리를 삭제하게 되는데
  // 가장 나중에 실행한 메소드를 삭제하기 때문에 후입선출방식이 적용된다.
}
