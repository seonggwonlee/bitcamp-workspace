package com.eomcs.basic.ex07_1;

public class Exam0520 {
// main() 메서드 : 프로그램 아규먼트
  public static void main(String[] args) {
    for (String value : args) {
      System.out.printf("[%s]\n", value);
    }
    System.out.println("종료");
  }
}

// 프로그램 아규먼트 : JVM실행할 때 프로그램에 전달하는 값
// java -cp bin/main com.eomcs.basic.ex07_1.Exam0520 aaa bbb ccc
// aaa bbb ccc가 프로그램 아규먼트이다.
// 공백을 기준으로 문자열을 잘라 배열 생성한다.