package com.eomcs.corelib.ex02_1;

public class Exam0161 {
  public static void main(String[] args) {

    StringBuffer buf = new StringBuffer("Hello");
    System.out.println(buf);

    buf.replace(2, 4, "xxxx");
    System.out.println(buf);
  }

  // StringBuffer는 mutable 객체이므로 원본 변경이 가능하다.
  // println() 메서드에 넘겨주는 파라미터값이 String이 아니더라도
  // println 자체적으로 toString으로 호출하여 그 값을 리턴한다.
  // 모든 클래스는 Object를 상속받으며 Object에는 toString 메서드가 있기 때문에
  // 모든 클래스에는 toString메서드가 존재한다.
}
