package com.eomcs.corelib.ex02_1;

public class Exam0160 {
  public static void main(String[] args) {
    String s1 = new String("Hello");

    String s2 = s1.replace('l', 'x');
    System.out.printf("%s, %s\n", s1, s2);

    String s3 = s1.concat(", world");
    System.out.printf("%s, %s\n", s1, s3);
  }
  // String 객체는 immutable객체이므로 한 번 담은 값을 변경할 수 없다.
  // 새롭게 변경하고 싶다면 새로운 인스턴스 객체를 만들어야한다.
  // 위 사례에서 replace와 concat은 원본을 변경시키지 않고 새로운 인스턴스 생성하여 변경한다.
}
