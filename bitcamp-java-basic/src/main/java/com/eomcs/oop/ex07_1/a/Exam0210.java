package com.eomcs.oop.ex07_1.a;


class Score2 {
  String name;
  int kor;
  int eng;
  int math;

  private int sum;
  private float avr;

  // sum과 avr은 연산 결과를 저장하는 변수이기 때문에 값을 임의로 변경해선 안된다.
  // 따라서 필드나 메서드의 외부 접근 범위를 조정하는 문법을 제공하는데
  // 이것이 캡슐화이다.

  public int getSum() {
    return this.sum;
  }

  public float getAvr() {
    return this.avr;
  }
  // sum과 avr을 직접 변경하진 못 해도
  // 해당 값을 조회/변경할 수 있는 방법이 있다. (메서드 이용)
  // 조회하는 용도로 사용하는 메서드 앞에는 'get'을(get필드명()) 붙인다. (위와 같은 예)
  // 이걸 'getter'라고 부르며 public으로 공개하는 것이 원칙이다.

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
  }
}

public class Exam0210 {
  public static void main(String[] args) {

    Score2 s1 = new Score2();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.getSum(), s1.getAvr());
  }
}
