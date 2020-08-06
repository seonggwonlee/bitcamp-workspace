package com.eomcs.basic.oop.ex02;

import com.eomcs.basic.oop.ex02.util.Score;

public class Exam0116 {

    public static void main(String[] args) {

      Score s1;
      s1 = new Score();

      s1.name = "홍길동"; // s1 객체에 있는 name필드에 홍길동 집어넣어라
      s1.kor = 100;
      s1.eng = 90;
      s1.math = 87;
      s1.compute();

      Score s2 = new Score();

      s2.name = "임꺽정";
      s2.kor = 90;
      s2.eng = 100;
      s2.math = 100;
      s2.compute();

      printScore(s1);

      System.out.println("-----------");

      printScore(s2);
    }

    static void printScore(Score s) {
      System.out.printf("%s : %d, %d, %d, %d, %.1f\n",
          s.name, s.kor, s.eng, s.math, s.sum, s.aver);
      // 고정된 값이 아니기 때문에 따로 묶거나 할 순 없다.
    }
  }