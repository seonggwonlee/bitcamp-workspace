package com.eomcs.basic.practice05;

public class Exam0442 {

  public static void main(String[] args) {

    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    for (int i = 0; i < names.length; i += 2) {
      System.out.println(names[i]);
    }
//    0부터 시작하여 2씩 올라가므로 1, 3, 5 출
  }
}
