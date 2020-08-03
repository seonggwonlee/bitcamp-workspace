package com.eomcs.basic.ex07_1;

public class Exam0260 {

  public static void main(String[] args) {
    String[] r = {"ㅇㅇ", "ㄴㄴ", "ㄷㄷ", "ㅁㅁ"};
    String[] r2 = new String[5];

    r2[0] = "안녕";
    r2[1] = "하세요";
    r2[2] = "하이";
    r2[3] = "요오";
    r2[4] = "ㅋㅌ";

    hello("가","나", "다", "라");
    hello(r);
    hello2(r2);
  }
  static void hello(String...name) {
    for (int i = 0; i < name.length; i++) {
    System.out.printf("%s님, 안녕하세요?\n",name[i]);
    }
    System.out.printf("---------------\n");
  }

  static void hello2(String[] name2) {
    for (int i = 0; i < name2.length; i++) {
      System.out.printf("%s님, 안녕하세요?\n", name2[i]);
    }
  }
}
