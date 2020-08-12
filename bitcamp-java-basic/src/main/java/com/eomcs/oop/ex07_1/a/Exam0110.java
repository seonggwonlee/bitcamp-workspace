package com.eomcs.oop.ex07_1.a;

public class Exam0110 {

  public static void main(String[] args) {

    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avr);
  }
}

class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float avr;

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
    }
  }