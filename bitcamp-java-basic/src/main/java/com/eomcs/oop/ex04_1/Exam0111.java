package com.eomcs.oop.ex04_1;

public class Exam0111 {

  public static void main(String[] args) {
    String s1 = new String("Hello");

    char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
    String s2 = new String(chars);

    byte[] bytes = {
        (byte)0x48,
        (byte)0x65,
        (byte)0x6c,
        (byte)0x6c,
        (byte)0x6f
    };
    String s3 = new String(bytes);

    System.out.printf("%s, %s, %s\n", s1, s2, s3);
  }
}

// 인스턴스 변수 초기화 위해 여러 개의 생성자를 생성할 수 있다.
// 생성자 생성시 인스턴스 변수 초기화 방법은 여러 가지다. (위에서 부터 문자열 리터럴, char[], byte[] 사용 등)
