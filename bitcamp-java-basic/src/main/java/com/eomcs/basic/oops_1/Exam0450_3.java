package com.eomcs.basic.oops_1;

public class Exam0450_3 {

  class X {

    private X() {
      System.out.println("X()");
    }
    // 생성자의 접근 범위를 private으로 설정하면 외부 접근 불가하여 생성자 호출할 수 없다. => 인스턴스 생성 불가
  }
  public static void main(String[] args) {
   // X obj1 = new X();
  }// private 변수를 통해 생성자의 접근이 막혀있다.
}
