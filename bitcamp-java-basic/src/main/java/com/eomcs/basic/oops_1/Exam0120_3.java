package com.eomcs.basic.oops_1;

public class Exam0120_3 {

  public static void main(String[] args) {

    class Score {

      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float avr;

    }

    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.avr = s1.sum / 3;


    s2.name = "임꺽정";
    s2.kor = 11;
    s2.eng = 35;
    s2.math = 74;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.avr = s2.sum / 3;


    s3.name = "장보고";
    s3.kor = 89;
    s3.eng = 55;
    s3.math = 100;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.avr = s3.sum / 3;

    System.out.printf("이름:%s\n국어:%d, 영어:%d, 수학:%d\n합계:%d,평균:%.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avr);
    System.out.println("---------");
    System.out.printf("이름:%s\n국어:%d, 영어:%d, 수학:%d\n합계:%d,평균:%.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.avr);
    System.out.println("---------");
    System.out.printf("이름:%s\n국어:%d, 영어:%d, 수학:%d\n합계:%d,평균:%.1f\n", s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.avr);

  }
}
