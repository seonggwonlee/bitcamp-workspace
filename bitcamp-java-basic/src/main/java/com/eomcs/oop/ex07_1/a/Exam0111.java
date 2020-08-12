package com.eomcs.oop.ex07_1.a;

public class Exam0111 {
  public static void main(String[] args) {

    Score s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();

    s1.sum = 300;
    s1.avr = 100f;

    // 개발자는 수많은 코드들을 보다가 착각하여 파라미터 변수 값을 수정할 수 있다.
    // 위와 같이 계산 후 값을 임의로 변경한다면 아래 출력값이 의도된 값이 나오질 않는다.
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avr);
  }
}

// 기존 필드의 값을 연산해서 나온 결과를 저장하는 경우엔 직접 해당 변수의 값을 변경하지 못 하게 막아야 한다.
// 메서드를 통해서 값을 변경할 수 있도록 한다.