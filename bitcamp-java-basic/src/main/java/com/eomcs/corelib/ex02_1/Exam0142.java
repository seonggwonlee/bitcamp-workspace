package com.eomcs.corelib.ex02_1;

public class Exam0142 {
  public static void main(String[] args) {
    Object obj = new String("Hello");

    String str = ((String)obj).toLowerCase();
    // 원래 클래스의 메서드를 호출하고 싶다면 형변환 해야한다.

    System.out.println(str);

    String x1 = (String)obj;
    str = x1.toLowerCase();
    System.out.println(str);
  }
}
