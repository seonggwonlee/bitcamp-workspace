package com.eomcs.basic.practice05;

public class practice67 {

  public static void main (String[] args) {

    // 상수 사용 시 이해하기 편하다.
    // 원래 case는 변수값 사용 불가하지만 final 변수는 예외적으로 가능하다.

    final int GUEST = 0, MEMBER = 1, ADMIN = 2;
    int level = 2;

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
      case MEMBER:
        System.out.println("글작성 가능합니다.");
      case ADMIN:
        System.out.println("변경, 삭제 가능합니다.");
        break;
    }
  }
}
