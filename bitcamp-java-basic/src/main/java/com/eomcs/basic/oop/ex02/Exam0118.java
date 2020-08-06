package com.eomcs.basic.oop.ex02;

import com.eomcs.basic.oop.ex02.util.Score3;

public class Exam0118 {

    public static void main(String[] args) {

      Score3 s1;
      s1 = new Score3();

      s1.init("홍길동", 100, 90, 87); // s1 객체에 있는 name필드에 홍길동 집어넣어라

      Score3 s2 = new Score3();

      s2.init("임꺽정", 90, 100, 100);

      printScore(s1);

      System.out.println("-----------");

      printScore(s2);

      s1.kor = 50;
      s1.compute();

      System.out.println("-----------");

      printScore(s1);
    }

    static void printScore(Score3 s) {
      System.out.printf("%s : %d, %d, %d, %d, %.1f\n",
          s.name, s.kor, s.eng, s.math, s.sum, s.aver);
      // 고정된 값이 아니기 때문에 따로 묶거나 할 순 없다.
    }
  }