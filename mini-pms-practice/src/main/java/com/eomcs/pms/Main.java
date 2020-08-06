package com.eomcs.pms;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    int a = keyInput.nextInt();
    int b = keyInput.nextInt();
    int c = keyInput.nextInt();
    keyInput.close();

    System.out.println((a + b) % c);
    System.out.println(((a % c) + (b % c)) % c);
    System.out.println((a * b) % c);
    System.out.println(((a % c) * (b % c)) % c);

  }
}