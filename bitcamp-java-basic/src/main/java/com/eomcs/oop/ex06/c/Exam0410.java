// 오버라이딩(overriding) - 오버라이딩과 super 키워드
package com.eomcs.oop.ex06.c;

public class Exam0410 {
  public static void main(String[] args) {
    D2 obj = new D2();
    obj.test();
  }
}

//this.메서드() 호출 => 현재 클래스부터 메서드를 찾는다 없으면 수퍼 클래스로 올라가며 다시 찾는다.
//super.메서드() 호출 => 바로 위 수퍼 클래스부터 메서드를 찾는다. 없으면 계속 위로 올라간다.








