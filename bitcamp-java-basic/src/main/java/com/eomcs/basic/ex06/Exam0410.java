package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0410 {

  public static void main(String[] args) {

    // for (변수선언 및 초기화; 조건; 증감문) 문장;
//    for (변수선언 및 초기화; 조건; 증감문) {문장};

//    for (int i = 0; i < 10; i++)
//      System.out.println(i);

    // for (int i= 0 ......) -> 1번째로 실행
    // for (...i<10;...) -> 2번째로 실행
    // System.out.println(i); -> 3번째로 실행
    // i++ -> 4번째로 실행
    // 그 후에는 2 > 3 > 4로 반복 실행

//    for (int i = 0; i < 5; i++) {
//      System.out.print("=> ");
//      System.out.println(i);
//    }
//    // i 변수를 밖에 빼놓는다면 for문 블록 밖에서도 i를 사용할 수 있음.
//    // for문에서 조건부분은 ;만 빼고 모두 비워도 된다. (for (;;))
//
//    System.out.println("--------------");
//
//    for(int i = 0; i < 3; i++) {
//      System.out.print("=> ");
//      System.out.println(i);
//    }
//    // 권장사항으로는 for문 안에서 따로 변수를 선언해서 for 문 안에서만 쓰는 것이 좋다.

    ArrayList<String> scores = new ArrayList<String>();
    scores.add("A");
    scores.add("A1");
    scores.add("A2");
    scores.add("A3");

    for (Object value : scores) {
      System.out.println(value);
    }

  }
}
