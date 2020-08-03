package com.eomcs.basic.ex07_1;

import java.util.Scanner;

public class Exam0130 {
// 메서드 : 리팩토링
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

  static int getSpaceLength(int totalStar, int displayStar) {
    return (totalStar - displayStar) / 2;
  }

  public static void main(String[] args) {
   Scanner keyInput = new Scanner(System.in);
   System.out.print("밑 변의 길이는 ? ");
   int len = keyInput.nextInt();

   for (int starLen = 1; starLen <= len; starLen += 2) {
     printSpaces(getSpaceLength(len, starLen));
     printStars(starLen);
     System.out.println();
   }
   keyInput.close();
  }
}
