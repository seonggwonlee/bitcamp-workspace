package com.eomcs.basic.oops_1;

import java.util.Scanner;

public class Exam0320_3 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avr;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
  }
}
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    System.out.print("성적을 입력하세요(예:홍길동 100 100) >");
    Score s1 = new Score();
    s1.name = keyInput.next();
    s1.kor = keyInput.nextInt();
    s1.eng = keyInput.nextInt();
    s1.math = keyInput.nextInt();

    System.out.print("성적을 입력하세요(예:홍길동 100 100) >");
    Score s2 = new Score();
    s2.name = keyInput.next();
    s2.kor = keyInput.nextInt();
    s2.eng = keyInput.nextInt();
    s2.math = keyInput.nextInt();

    // 특정 인스턴스에 대해 작업을 수행할 때는 인스턴스 메서드 호출한다.
    s1.compute(); // s1에 들어있는 인스턴스 주소는 compute()에 전달된다.
    s2.compute(); // s2에 들어있는 인스턴스 주소를 compute()에 전달한다.

    keyInput.close();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avr);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.avr);
  }
}
