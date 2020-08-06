package com.eomcs.basic.oop.ex03;

public class Exam0421 {

  static class SmartPhone {

    int volume;
    int bright;
    int contrast;

    // 다음과 같이 기본 생성자를 직접 정의할 수 있다.
    public SmartPhone(int a) {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }
}

  public static void main(String[] args) {

    SmartPhone obj1 = new SmartPhone(100);
    // SmartPhone obj2 = new SmartPhone(3.14);

    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.contrast);

  }
}