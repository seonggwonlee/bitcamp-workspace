package com.eomcs.corelib.ex01_1;

public class Exam0122 extends Object{

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avr;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.avr = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s1 = new Score ("홍길동", 100, 100, 100);
    String str = s1.toString();

    System.out.println(str);
  }
}
