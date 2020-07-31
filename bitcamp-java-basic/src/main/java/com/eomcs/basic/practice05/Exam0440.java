package com.eomcs.basic.practice05;

public class Exam0440 {

  //for(;;) 와 배열
  public static void main(String[] args) {

    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    // String[] names = new String[5] 를 이용하면 코드가 복잡해지기 때문에
    // String[] names = new String[] {"", "", ...}를 사용한다.

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
