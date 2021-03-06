package com.eomcs.oop.ex03_1;

// 생성자 - this()
public class Exam0440 {
  // Exam0410에도 생성자가 있다. (생성자는 특별한 인스턴스 메서드)
  // public Exam0410 () {}

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    public Score() {
      // 다른 생성자를 호출할 때는 this변수를 사용한다.
      this("홍길동", 100, 90, 80);
    }

    public Score(String name) {
      this.name = name;
    }

    public Score (String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
       }


    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3;
    }
}
  // 생성자란?
  // 클래스 이름과 같은 이름으로 메서드를 만든다.(위에선 Exam0410)
  // 리턴 타입을 선언하지 않는다. (값 리턴하지 않음)
  // 인스턴스 생성시 자동 호출 된다.
  // 일반 메서드 처럼 따로 호출할 순 없다.
  // 모든 클래스에는 반드시 1개 이상의 생성자가 존재하며 개발자가 따로 생성하지 않는다면
  // 컴파일러가 자동으로 생성한다.
  // 보통 사용 용도는 인스턴스를 생성 후 인스턴스 변수를 초기화 시키는 용도로 사용한다.
  // 또는 생성한 인스턴스가 제대로 쓰일 수 있도록 유효한 값으로 초기화 시키는 역할도 한다.
  public static void main(String[] args) {
    // 생성자 호출 방법
    // new 명령에서 호출할 생성자의 파라미터 값을 지정하면 된다.
    // 파라미터 값을 주지 않으면 기본 생성자를 생성한다.
    // Score s1 = new Score() => 기본 생성자
    // 파라미터 값을 주지 않고서는 new 명령어 실행할 수 없다.
    Score s = new Score();
    Score s1 = new Score("ㅇㅇ");
    Score s2 = new Score("홍길동", 100, 90, 80);
    // 생성자가 여러 개면 파라미터로 구분한다.

    System.out.printf("총합 : %d\n평균 : %.1f\n", s2.sum, s2.average);
  }
}
