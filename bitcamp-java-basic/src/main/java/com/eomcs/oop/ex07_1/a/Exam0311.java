package com.eomcs.oop.ex07_1.a;

class Score4 {

  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float avr;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getKor() {
    return kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getEng() {
    return eng;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getMath() {
    return math;
  }

  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
  }

  public int getSum() {
    return this.sum;
  }

  public float getAvr() {
    return this.avr;
  }
}

public class Exam0311 {

  public static void main(String[] args) {

    Score4 s1 = new Score4();

    s1.setName("홍길동");
    s1.setKor(95);
    s1.setEng(33);
    s1.setMath(48);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.getName(), s1.getKor(), s1.getEng(), s1.getMath(), s1.getSum(), s1.getAvr());
  }
}
