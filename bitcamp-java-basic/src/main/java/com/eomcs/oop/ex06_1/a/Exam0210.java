package com.eomcs.oop.ex06_1.a;

public class Exam0210 {
  public static void main(String[] args) {
    Vehicle v1 = new Sedan();

    v1.model = "티코";
    v1.capacity = 5;

    // 자바 컴파일러는 레퍼런스의 클래스를 보고 사용 가능한 변수/메서드인지 판단 한다.
    // 레퍼런스 변수가 가리키는 인스턴스가 어디인지가 중요한 것이 아닌,
    // 해당 레퍼런스 변수의 클래스가 어떤 것인지에 따라 판단한다.

//    v1.cc = 890;
//    v1.valve = 16;
//    v1.sunroof = true;
//    v1.auto = true;
    // => v1의 레퍼런스 클래스는 Vehicle이므로 model과 capacity변수만 사용할 수 있다.
    // => 수퍼 클래스의 레퍼런스로 서브 클래스의 변수를 선언하고 싶다면 형변환 이용하면 된다.

    ((Sedan)v1).cc = 890;
    ((Sedan)v1).valve = 16;
    ((Sedan)v1).sunroof = true;
    ((Sedan)v1).auto = true;
    // => 형변환 이용

    // 형변환 이용이 번거롭다면 레퍼런스 변수 자체를 형변환 하여 이용하면 된다.

    Sedan s = (Sedan)v1;

    s.cc = 890;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;

    System.out.printf("%d, %d, %b, %b\n", s.cc, s.valve, s.sunroof, s.auto);
  }
}
