package com.eomcs.basic.practice05;

public class Exam0441 {

  public static void main(String[] args) {

    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    for (int i = 2; i < 4; i++) {
      System.out.println(names[i]);
    }
    // 배열은 0부터 시작하므로 유관순, 윤봉길 출력
  }
}
