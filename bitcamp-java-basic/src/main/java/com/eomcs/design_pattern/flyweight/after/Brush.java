package com.eomcs.design_pattern.flyweight.after;

public class Brush {
  String pattern;

  public Brush () {
    pattern = " ";
  } // 브러쉬를 지정하지 않았을 때

  public Brush (String pattern) {
    this.pattern = pattern;
  } // 브러쉬를 임의 지정했을 때

  public void draw (int length) {
    for (int i = 0; i < length; i++) {
      System.out.print(pattern);
    }
   }
}
