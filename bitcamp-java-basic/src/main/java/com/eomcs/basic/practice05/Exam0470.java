package com.eomcs.basic.practice05;

import java.util.ArrayList;

public class Exam0470 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>(); // 제네릭 적용
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");
    list.add("김원봉");
    list.add("김구");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
