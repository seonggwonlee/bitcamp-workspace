package com.eomcs.oop.ex07_1.a;


public class Exam0211 {
  public static void main(String[] args) {

    Score2 s1 = new Score2();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    s1.eng = 100;
    s1.math = 100;

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.getSum(), s1.getAvr());
  }
  // 캡슐화를 통해 연산결과를 저장하는 변수의 임의 변경을 막았지만
  // 그 연산에 들어가는 재료 변수의 값을 임의 변경하고, 연산을 하지 않는다는 문제가 발생할 수 있다.
}
