package com.eomcs.basic.practice05;

public class practice68 {

  enum Level {
    GUEST, MEMBER, ADMIN
  }
  public static void main (String[] args) {

    // enum을 사용하면 조금 더 조직적으로 상수를 관리할 수 있다.
    // enum은 메서드 밖에서 선언한다.

    Level level = Level.GUEST;
    // enum 타입의 변수를 선언한다.
    // final int처럼 직접 값을 지정하지 않아도 된다.

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다");
        break;
      case MEMBER:
        System.out.println("글작성 가능합니다");
        break;
      case ADMIN:
        System.out.println("변경 삭제 가능합니다.");
        break;
    }

    // enum을 주로 사용하는 이유는 값을 직접 지정하지 않아도 되서이다
  }
}
