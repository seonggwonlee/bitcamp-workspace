package com.eomcs.basic.oops_1;

public class Exam0410_3 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avr;

  Score() {
    System.out.println("Score()");
  }
  // 생성자
  // 클래스 이름과 같은 이름으로 메서드를 만든다.
  // 리턴타입선언하지 않는다.
  // 인스턴스 만들 때 자동 호출된다. => 나중에 따로 호출할 수 없다.
  // 생성자 만들지 않는다면 컴파일러가 따로 생성한다. => 모든 클래스에는 반드시 1개 이상의 생성자가 존재한다.
  // 인스턴스를 만든 후 인스턴스 변수 초기화 용도로 많이 사용된다. => 생성된 인스턴스가 제대로 쓰일 수 있도록 유효한 값으로 초기화시킨다.

  public void compute() {
    // 생성자 호출
    // 인스턴스 생성하는 new 명령에서 호출할 생성자의 파라미터값 설정한다.
    // 파라미터 값을 주지 않으면 기본 생성자를 호출한다.
    this.sum = this.kor + this.eng + this.math;
    this.avr = this.sum / 3f;
    }
}
  public static void main(String[] args) {

  }
}
