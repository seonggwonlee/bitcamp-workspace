package com.eomcs.oop.ex06_1.a;

public class Exam0310 {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();

    v1.model = "티코";
    v1.capacity = 5;

    Sedan s = (Sedan)v1;

    s.cc = 890;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;

    System.out.printf("%d, %d, %b, %b\n", s.cc, s.valve, s.sunroof, s.auto);

    // v1은 Vehicle의 객체를 담은 레퍼런스 변수이다.
    // 형변환을 통해 서브 클래스인 Sedan 객체의 주소로 변환한다면
    // 컴파일은 할 수 있으나 실제로 실행시에는 JVM이 한 번 더 검사하여 v1 변수가
    // Sedan의 레퍼런스 변수인지 확인한다.
    // 따라서 실행할 때에는 runtime exception error 출력하게 된다.
  }
}
