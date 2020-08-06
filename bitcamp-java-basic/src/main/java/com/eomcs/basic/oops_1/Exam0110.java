package com.eomcs.basic.oops_1;

import com.eomcs.basic.oops_1.util.Score;

public class Exam0110 {

  public static void main(String[] args) {

    Score s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 97;
    s1.math = 87;
    s1.calculate();

    Score s2 = new Score();

    s2.name = "홍길동";
    s2.kor = 99;
    s2.eng = 79;
    s2.math = 83;
    s2.calculate();

    printScore(s1);

    System.out.println("------------");

    printScore(s2);

  }
  static void printScore(Score s) {
    System.out.printf("이름 : %s\n국어 : %d, 영어 : %d, 수학 : %d\n총합 : %d\n평균 : %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.avr);
  }
}