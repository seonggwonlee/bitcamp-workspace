package com.eomcs.basic.oops_1.util;

  public class Score {

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float avr;

  public void calculate() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
  }

  static void init(String name, int kor, int eng, int math) {

  }
}
