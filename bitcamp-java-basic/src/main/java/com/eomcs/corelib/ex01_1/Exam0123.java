package com.eomcs.corelib.ex01_1;

public class Exam0123 {

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
      @Override
      public String toString() {
        return String.format("%s, %d, %d, %d, %d, %.1f",
            this.name, this.kor, this.eng, this.math, this.sum, this.avr);
    }
      // Object로부터 상속 받은 toString()의 리턴값이 마음에 들지 않는다면 재정의 하라.
      // 보통 인스턴스의 데이터를 문자열로 리턴한다.
      // 인스턴스 내부 값을 빠르게 보고 싶을 때 메서드를 오버라이딩 한다.
  }

  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 100, 100);


    String str = s1.toString();
    // Score클래스를 오버라이딩 했기 때문에 Score의 toString()을 호출한다.
    System.out.println(str);
    System.out.println(s1);
  }
}
