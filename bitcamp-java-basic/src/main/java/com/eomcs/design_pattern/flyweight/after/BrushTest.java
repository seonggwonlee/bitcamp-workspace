package com.eomcs.design_pattern.flyweight.after;

import java.util.Scanner;

public class BrushTest {
  public static void main(String[] args) {
    BrushPool brushPool = new BrushPool();

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
      // 사용자가 입력한 패턴의 브러시를 브러시풀에서 꺼내 쓴다.
      // 매번 생성하지 않기 때문에 가비지 생성이 최소화된다. => flyweight 패턴의 사용 이유

      Brush brush = brushPool.getBrush(patterns);
      brush.draw(length);
    }

    keyboard.close();
  }
}
