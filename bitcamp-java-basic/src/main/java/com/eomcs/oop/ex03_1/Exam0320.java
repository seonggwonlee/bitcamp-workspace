package com.eomcs.oop.ex03_1;

import java.util.Scanner;

public class Exam0320 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
  public void execute() {
   this.sum = this.kor + this.eng + this.math;
   this.average = sum / 3;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Score compute = new Score();

    System.out.print("성적 데이터를 입력해주세요.");
    compute.name = in.nextLine();
    compute.kor = in.nextInt();
    compute.eng = in.nextInt();
    compute.math = in.nextInt();

    compute.execute();

    System.out.printf("이름 : %s,"
        + "국어 : %d, \n"
        + "영어 : %d, \n"
        + "수학 : %d, \n"
        + "총합 : %d, \n"
        + "평균 : %.1f\n", compute.name, compute.kor, compute.eng, compute.math, compute.sum
        , compute.average);

  }
}
