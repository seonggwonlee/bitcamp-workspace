package com.eomcs.basic.practice05;

public class practice63 {

  public static void main (String[] args) {

    byte b = 2;
    switch (b) {

      case 1:
      case 2:
        default:
    }

    short s = 2;
    switch (s) {
      case 1:
      case 2:
        default:
    }

    int i = 2;
    switch (i) {
      case 1:
      case 2:
        default:
    }

    char c = 'A'; // A문자의 유니코드 값(UTF-16)을 c에 저장한다.
    // 유니코드 값은 int에 속하므로 switch 이용 가능하다.
    switch (c) {
      case 'A':
      case 66:
      case 0x43:
        default:
    }

    String str = "hello";
    switch (str) {
      // case의 값으로 String이 가능하다.
      case "hello":
      case "ohora":
      case "hul":
      default:
    }
  }
}
