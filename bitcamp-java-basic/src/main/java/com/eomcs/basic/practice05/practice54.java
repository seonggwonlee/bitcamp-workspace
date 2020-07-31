package com.eomcs.basic.practice05;

public class practice54 {

  public static void main(String[] args) {

    int age = 15;

    if (age >= 19)
      if (age >= 70)
        System.out.println("지하철 무임승차 가능");
    else
      System.out.println("미성년입니다.");

    System.out.println("------------------------------");

    // else는 가장 가까운 if에 소속되므로  age >= 70 if문으로 소속된다.
    // if (age >= 70) ~ else문을 한 문장으로 본다.
    // 따라서 {}를 사용할 필요는 없다.
    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능");
      else
        System.out.println("미성년입니다.");
      }
    System.out.println("------------------------------");

    // else문을 첫번째 if 문에 소속하게 하려면
    // {}를 사용하여 묶어야 된다.
  }
}
