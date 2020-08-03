package com.eomcs.basic.ex07_1;

public class Exam0220 {

  public static void main(String[] args) {
    System.out.println("main()11111");
    hello("홍길동", 20);

    System.out.println("main()22222");
    hello("임꺽정", 20);
  }
  static void hello(String name, int age) {
    System.out.printf("%d살 %s님, 반갑습니다.\n", age, name);
  }

  // String name, int age => 파라미터
  // 홍길동, 20 => 아규먼트
  // 우선 메서드 호출 시 홍길동, 20이 파라미터로 값을 넘겨주고
  // 파라미터가 해당 아규먼트를 받아 hello에 넘겨준다.
  // 그럼 main 메서드에서 호출한 hello 메서드가 넘겨준 값을 출력하게 된다.
}
