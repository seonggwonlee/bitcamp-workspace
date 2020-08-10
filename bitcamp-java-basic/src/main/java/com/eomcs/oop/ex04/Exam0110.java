package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    String s1 = new String(); // 로컬 변수는 값을 저장해야만 조회할 수 있다
    System.out.println("=>" + s1);

    String s2 = new String("Hello");
    System.out.println("=>" + s2);

    char[] chars = new char[] {'H', 'e', 'l', 'l', 'o', '2','!'};
    String s3 = new String(chars);
    System.out.println("=>" + s3);

    byte[] bytes = new byte[] {
        0x41, // A
        0x42, // B
        (byte)0xEA, // 가 => 그냥 쓰면 양수 취급된다. 11101010 => 234로 취급된다.
        (byte)0xB0,
        (byte)0x80,
        (byte)0xEA, // 각 => AC01
        (byte)0xB0,
        (byte)0x81,
    };
    String s4 = new String(bytes, "UTF-8");
    System.out.println("=>" + s4);

    byte[] bytes2 = new byte[] {
        0x41, // A
        0x42, // B
        (byte)0xB0,
        (byte)0xA1,
        (byte)0xB0,
        (byte)0xA2,
        (byte)0xB6, // 똘(EUC-KR)
        (byte)0xCA,
        (byte)0x8C, // 똠(MS949/CP949)
        (byte)0x63,
        (byte)0xB6, // 똥(EUC-KR)
        (byte)0xCB
    };
    String s5 = new String(bytes2, "MS949"); // MS949(11172자) = EUC-KR(2350자) + x
    System.out.println("=>" + s5);

    Date d1 = new Date(); // 실행하는 시점의 현재 날짜와 시분초로 초기화시킨다.
    System.out.println(d1.toString());
    System.out.println(d1); // 아규먼트가 primitive type이나 String타입이 아니면
    // 인스턴스에 대해 toString()을 호출하여 그 리턴 값을 출력한다.
    // 자바에 모든 클래스에 대해 toString을 호출할 수 있다.

    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString());
    System.out.println(arr);

    int a = 100;
    //System.out.println(a.toString()); // primitive type은 toString안됨

    Date d2 = new Date(100000);
    System.out.println(d2);

    Date d3 = new Date(120, 8, 10);
    System.out.println(d2);


    // 클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    // 이런 클래스의 인스턴스를 만들려면 보통 2가지 방법 사용한다.
    // 1. 다른 클래스의 도움을 받는다.
    // 2. 해당 클래스에서 제공하는 클래스 메서드(스태틱 메서드)를 사용한다.
    // 똑같은 인스턴스를 만들지 않기 위해

    // Calendar c1 = new Calendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1.toString());

    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1 == car2);
    car1.model = "티코";
    car1.cc = 980;
    car2.model = "소나타";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);

    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
    car3.model = "비트카";
    System.out.println(car4.model);
  }
}

class Car {
  String model;
  int cc;
}

class Car2 {
  String model;
  int cc;
  static Car2 obj;

  private Car2() {  }

  static Car2 getInstance() {
    // 보통 생성자를 private으로 막는 경우는 인스턴스를 한 개만 생성하도록 제한하고 싶을 때이다.
    if (obj == null) {
      obj = new Car2 ();
    }
    return obj;
  }
}
// Car2 예제가 Calendar를 왜 new명령어로 하지 않고 getInstance로 생성하는지 알려주는 예이다.
// Calendar는 1개 이상 필요 없으므로 new명령어로 중복해서 생성하는 것을 막고자 함이다.

// class내 선언하는 클래스 => 중첩 클래스
// class 밖에서 선언하는 클래스 => 패키지 멤버 클래스