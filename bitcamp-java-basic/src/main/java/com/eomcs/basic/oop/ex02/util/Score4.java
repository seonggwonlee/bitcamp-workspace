package com.eomcs.basic.oop.ex02.util;

 public class Score4 {

    public String name;
    public int kor;
    public int eng;
    public int math;
    public int sum;
    public float aver;

    public void compute() { // 여기서 this는 computeScore의 로컬 변수
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
  }

    public Score4(String name, int kor, int eng, int math) { // 생성자, 리턴타입은 적지 않고 메서드 명은 인스턴스 명과 같게한다.
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;

      this.compute();
    }
}
