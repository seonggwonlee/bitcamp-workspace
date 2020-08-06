package com.eomcs.basic.oop.ex02.util;

 public class Score2 {

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

    public void init(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }
}
