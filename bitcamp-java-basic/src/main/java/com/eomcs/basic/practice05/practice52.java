package com.eomcs.basic.practice05;

public class practice52 {

  public static void main (String[] args) {

    if (true) System.out.println("1111");
    if (false) System.out.println("2222");
    if (10 < 8 + 5) System.out.println("3333");

//    if (1) System.out.println("4444");
//    if (3.14f) System.out.println("4444");
//    if (0b0110 & 0b0011) System.out.println("4444");

    // if문 조건은 반드시 boolean타입이어야 한다.
    // 따라서 밑 문장들은 모두 컴파일 오류다.

    int a = 100;
    if (a == 100) System.out.println("5555");
    // ==와 =를 헷갈리지 말아야 한다.

    boolean b;
    if (b = true) System.out.println("된다.");

  }
}
