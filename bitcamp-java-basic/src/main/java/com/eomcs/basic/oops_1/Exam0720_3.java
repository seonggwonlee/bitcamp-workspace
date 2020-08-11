package com.eomcs.basic.oops_1;

public class Exam0720_3 {

  static class A {
    int a;
    int b;
    int c;

    // 여러 생성자에 공통 코드가 존재한다면 별도의 블록으로 관리하는 것이 효율적이다.
    // 인스턴스 초기화 블록은 이럴 때 사용한다.
    {
      a = 100;
      System.out.println("인스턴스 초기화 블록 실행");
    }
    // 인스턴스 초기화 블록 사용 후


    public A() {
      a = 200;
      System.out.println("A() 생성자 호출");
    }
    // 생성자가 있다면 존재하는 생성자의 앞 부분에 삽입된다.
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
  }
}
