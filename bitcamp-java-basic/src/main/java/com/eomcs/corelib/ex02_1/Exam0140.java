package com.eomcs.corelib.ex02_1;

public class Exam0140 {
  public static void main(String[] args) {
    String s1 = new String("Hello");

    String s2 = s1.toString();

    System.out.println(s1 == s2);
    System.out.println(s1);

    // Object의 toString은 클래스명@해시값을 리턴한다.
    // String 클래스에선 오버라이딩 하였는데, this 주소를 그대로 리턴한다.
    // 따라서 s1의 주소를 s2로 그대로 리턴하면서 true와 Hello가 출력된다.
  }
}
