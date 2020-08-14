package com.eomcs.corelib.ex02_1;

public class Exam0125 {
  public static void main(String[] args) {

    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1.toString().equals(b2.toString()));
    //따 라서 문자열 비교를 원하면 String을 꺼내 비교하면 된다.
  }
}
