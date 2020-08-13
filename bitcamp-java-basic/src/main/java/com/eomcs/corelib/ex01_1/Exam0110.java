package com.eomcs.corelib.ex01_1;

// Object클래스 => 자바의 최상위 클래스

public class Exam0110 {
  static class My {

  }
  // 클래스 정의 시 수퍼 클래스를 따로 정의 하지 않는다면 Object 클래스를 자동 상속받는다.

  public static void main(String[] args) {
    My obj = new My();

    System.out.println(obj instanceof My);
    System.out.println(obj instanceof Object);
    // instanceof => 레퍼런스가 가리키는 인스턴스가 지정한 클래스를 인스턴스이거나 조상으로 갖는지 확인한다.

    System.out.println(obj.toString());
    System.out.println(obj.hashCode());
    System.out.println(obj.equals("Hello"));
    // toString 부터 equals까지 모두 Object클래스의 메서드이며, Object클래스는 최상위 클래스로 모든
    // 클래스가 상속 받기 때문에 다형적 변수 문법에 의거하여 Object메서드를 사용할 수 있다.
  }
}
