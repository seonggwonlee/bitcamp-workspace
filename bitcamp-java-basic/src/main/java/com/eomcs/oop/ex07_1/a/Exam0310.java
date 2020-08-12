package com.eomcs.oop.ex07_1.a;

class Score3 {
  String name;

  private int kor;
  private int eng;
  private int math;

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public int getKor() {
    return this.kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public int getEng() {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getMath() {
    return this.math;
  }

  private int sum;
  private float avr;

  public int getSum() {
    return this.sum;
  }

  public float getAvr() {
    return this.avr;
  }

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
  }
}

public class Exam0310 {
  public static void main(String[] args) {
    Score3 s1 = new Score3();

    s1.name = "홍길동";
    s1.setKor(90);
    s1.setEng(100);
    s1.setMath(70);

    s1.setKor(60);
    s1.setMath(30);

    System.out.printf("국어 점수 : %d\n", s1.getKor());
    System.out.printf("영어 점수 : %d\n", s1.getEng());
    System.out.printf("수학 점수: %d\n", s1.getMath());
    System.out.printf("총합 : %d\n", s1.getSum());
    System.out.printf("평균 : %.1f\n", s1.getAvr());
    System.out.printf("성함 : %s\n", s1.name);

  }
}

// 연산 결과를 저장하는 변수인 sum과 avr을 private으로 변경 불가하게 변경했으나,
// 그 재료가 되는 변수들을 수정한다면 일일이 compute 메서드를 통해 결과값을 계산시켜야한다.
// 그렇게 되면 수만 줄의 코드를 볼 때 보기가 힘들어진다.
// 따라서 set(필드명)메서드를 사용하여 값이 자동으로 연산할 수 있게 만든다.
// 이런 메서드를 'setter'라고 부르며 외부에서 호출 가능하게 공개 모드로 설정한다.
// 그리고 setter를 사용할 때 역시 메서드들을 private으로 비공개 전환하기 때문에
// getter를 추가하여 조회도 가능하게 만든다.
// 프로그램 작성 시 메서드 공개는 private을 기본으로 한다.