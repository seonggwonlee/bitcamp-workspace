package com.eomcs.basic.ex07_1;

public class Exam0240 {
  public static void main(String[] args) {
    String s = hello("홍길동", 20);
    System.out.println(s);
  }
  static String hello(String name, int age) {
   String retVal = String.format("%d살 %s님, 안녕하세요?", age, name);
   return retVal;
  }

  // 리턴값과 파라미터값 전부 존재하는 메서드
  // 아규먼트를 통해 메서드 파라미터에 전달
  // 파라미터 전달 받고 메서드 실행
  // 실행된 메서드 리턴
  // main 메서드에서 해당 메서드 호출하여 사용
  // 여기서 리턴값은 꼭 사용하지 않아도 된다.
  // 사용하지 않은 리턴 값은 버려진다.
}
