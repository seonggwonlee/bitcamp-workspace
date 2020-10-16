package com.eomcs.design_pattern.flyweight.before;

import java.util.Scanner;

public class BrushTest {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.println();
      System.out.print("패턴? ");
      String patterns = keyboard.nextLine();

      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());

      if (length <= 0) {
        break;
      }
      // 사용자가 입력한 패턴의 브러시 객체를 생성한다.
      // 매번 생성하고 사용 후 버린다.
      // 가비지가 계속 생성되는 문제가 있다.
      // 생성한 객체를 사용 후 버리지 말고 보관하여 재사용한다.

      Brush brush = new Brush(patterns);
      brush.draw(length);
    }

    keyboard.close();
  }
}
