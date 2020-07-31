package com.eomcs.basic.practice05;

public class Exam0413 {

  public static void main(String[] args) {

    int i = 1;
    for (;;) {
      if (i > 5)
        break;
      System.out.println(i);
      i++;
    }
    // 조건문 역시 밖으로 빼낼 수 있다.
    // 결국 for문에서 변수 선언, 조건문, 증감문 모두 밖으로 뺴낼 수 있다.
    // 그러나 그냥 빼면 안되고 ;을 꼭 기입해야 한다.
    // 변수 선언의 경우 for문 안에서 새로 선언 하여 블록 안에서만 잠깐 쓰는 것이 용이하다.
  }
}
