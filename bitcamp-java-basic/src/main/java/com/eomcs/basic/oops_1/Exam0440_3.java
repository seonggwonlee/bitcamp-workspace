package com.eomcs.basic.oops_1;

public class Exam0440_3 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avr;

    Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3;
  }

  Score() {

  }

  Score(String name, int kor) {
    this.name = name;
    this.kor = kor;
    this.compute();
  }
}

  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 33, 44, 55);
    Score s2 = new Score();
    Score s3 = new Score("홍길동", 999);

    System.out.printf("%s, %d, %d, %d, %d, %f\n",s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avr);
    System.out.printf("%s, %d, %d, %d, %d, %f\n",s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.avr);
    System.out.printf("%s, %d, %d, %d, %d, %f\n",s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.avr);
  }
}
