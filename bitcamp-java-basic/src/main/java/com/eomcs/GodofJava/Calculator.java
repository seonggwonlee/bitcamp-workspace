package com.eomcs.GodofJava;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Calculator cal = new Calculator();

    System.out.print("a 입력 : ");
    int a = in.nextInt();
    System.out.print("b 입력 : ");
    int b = in.nextInt();

    System.out.println("a + b : " + cal.add(a, b));
    System.out.println("a - b : " + cal.minus(a, b));
    System.out.println("a * b : " + cal.multiple(a, b));
    System.out.println("a / b : " + cal.devide(a, b));
  }

  private int add(int a, int b) {
    return a + b;
  }
  private int minus(int a, int b) {
    return a - b;
  }
  private int multiple(int a, int b) {
    return a * b;
  }
  private int devide(int a, int b) {
    return a / b;
  }
}
