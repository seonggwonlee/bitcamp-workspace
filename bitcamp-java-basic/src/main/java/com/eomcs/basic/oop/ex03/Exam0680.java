// 스태틱 초기화 블록(static initializer) - 변수 초기화 문장(variable initializer)
package com.eomcs.basic.oop.ex03;

public class Exam0680 {

  public static class A {
    static int a = 100;
    static {
      a = 200;
      System.out.println("static {} 실행");
    }

    static {
      b = 400;
    }
    static int b = 300;

    // 변수 초기화 문장(variable initializer)을 컴파일 할 때,
    // - 모든 스태틱 필드를 먼저 만든다.
    // - 스태틱 변수 초기화 문장을 스태틱 블록으로 변경 후
    //   모든 스태틱 블록을 순서대로 한 스태틱 블록에 합친다.
    // - 스태틱 변수 초기화 문장과 스태틱 블록을 선언 순서대로
    //   하나의 스태틱 블록에 합친다.
    // - 위의 문장은 다음 문장으로 바뀐다.
    //
    // static int a;
    // static {
    //   a = 100;
    //   a = 200;
    //   System.out.println("static {} 실행");
    // }
    // - 바이트 코드(Exam0680$A.class)를 확인해 보라!
  }

  public static void main(String[] args) throws Exception {

    System.out.println(A.a);
    System.out.println(A.b);
  }
}


