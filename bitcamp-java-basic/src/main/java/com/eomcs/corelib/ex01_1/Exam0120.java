package com.eomcs.corelib.ex01_1;

public class Exam0120 {
  static class My {

  }

  public static void main(String[] args) {
    My obj = new My();

    System.out.println(obj.toString());
    // toString => Object클래스 메서드 중 하나로, 해당 클래스의 정보를 간단히 출력한다.
    // 출력 형식 : 패키지명.클래스명@16진수 해시값
    // 여기서 해시 값이란 인스턴스마다 부여된 고유값 (또는 식별값)이다.
    // 주소값이 아니다.
    // 해시값으로 인스턴스의 동일여부를 확인한다.
    // toString으로 오버라이딩(재정의)하지 않고 원래 메서드를 그대로 계속 사용하면
    // 인스턴스마다 새로운 해시값이 부여된다.
    My obj2 = new My();
    My obj3 = new My();

    System.out.println(obj2 == obj3);

    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }
}
