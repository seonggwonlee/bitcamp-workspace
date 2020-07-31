package com.eomcs.basic.practice05;

public class Exam0450 {

  public static void main(String[] args) {

    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    for(String name : names) {
      System.out.println(name);
    }

//    String name;
//    for(name : names) {
//      System.out.println(name);
//    }
    // 배열의 주소를 적는 문법을 사용할 경우 위와 같은 방식은 사용할 수 없다.
    // 즉, 주소를 사용할 때 변수 선언을 바깥에 할 수 없다.

  }
}
