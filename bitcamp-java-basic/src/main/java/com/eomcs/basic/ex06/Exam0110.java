package com.eomcs.basic.ex06;

// 조건문
public class Exam0110 {

  public static void main(String[] args) {

    int gender = 2;

    if (gender == 1) {  // ;이 끝나는 문장까지를 참 조건식의 한 묶음 여러 문장을 묶고 싶다면 {} 이용
      // if 조건식 안에는 True나 false같은 논리값이 와야한다.
      System.out.println("여성");
      System.out.println("------");
    } else {
      System.out.println("남성");
      System.out.println("------");
    }

    System.out.println("--------------------");

    int age = 64;

    if (age >= 19)  // ;이 끝나는 문장까지를 참 조건식의 한 묶음 여러 문장을 묶고 싶다면 {} 이용
      // if 조건식 안에는 True나 false같은 논리값이 와야한다.
      System.out.println("성인");

    if (age >= 65)
      System.out.println("노인연금 수령 대상자");

    System.out.println("--------------------");

    int age2 = 17;

    if (age2 >= 19)
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능 연령");
    else // else는 가장 가까운 if에 속한다.
      System.out.println("미성년자");


    System.out.println("--------------------");

    int age3 = 67;

    if (age3 < 8)
      System.out.println("아동");
    else
      if (age3 < 14)
        System.out.println("어린이");
      else
        if (age3 < 19)
          System.out.println("청소년");
        else
          if (age3 < 65)
            System.out.println("성인");
          else
            System.out.println("노인");

    System.out.println("--------------------");

    age3 = 22;

    if (age3 < 8) {
      System.out.println("아동");
    } else if (age3 < 14) {// 자바는 else if 문법 자체가 없고, 해당 형태는 단지 문법 정리를 한 것 뿐이다.
      System.out.println("어린이");
    } else if (age3 < 19) {
      System.out.println("미성년자");
    } else if (age3 < 65) {
      System.out.println("성인");
    } else {
      System.out.println("노인");
    }

  }
}
