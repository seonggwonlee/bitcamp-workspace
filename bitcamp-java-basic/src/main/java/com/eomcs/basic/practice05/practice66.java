package com.eomcs.basic.practice05;

public class practice66 {

  public static void main (String[] args) {

    int level = 1;

    // 상수를 사용하지 않는다면 한 눈에 보기 어렵다.
    // 따라서 주석을 달아야지만 다른 사람이 볼 때 이해할 수 있다.

    switch (level) {

      case 0: // 손님
        System.out.println("조회만 가능합니다.");

      case 1: // 일반회원
        System.out.println("글작성 가능합니다.");

      case 2: // 관리자
        System.out.println("삭제, 변경 권한을 가질 수 있습니다.");
        break;
    }
  }
}
