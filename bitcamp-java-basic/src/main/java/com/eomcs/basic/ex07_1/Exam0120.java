package com.eomcs.basic.ex07_1;

import java.util.Scanner;

public class Exam0120 {

    public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    System.out.print("밑 변의 길이? ");
    int len = keyInput.nextInt();

    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpaces((len - starLen) / 2);
      printStars(starLen);
      System.out.println();
    }

    keyInput.close();
  } // 메인 메서드 끝

  static void printSpaces(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print(" ");
    }
  }

  static void printStars(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print("*");
    }
  }

} // class 끝
