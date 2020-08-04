package com.eomcs.basic.ex07;

// call by value, call by reference
public class Exam0310 {

  static class Person {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {
    int a = 200; // a라는 변수에 200을 넣어라

    m1(a); // m1 메서드에 200을 넘겨라
    System.out.println(a);

    a = 300;

    m1(a);
    System.out.println(a);

    int[] arr = new int[3];

    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;


    m2(arr); // call by reference

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println("-------------------");

    Person p = new Person(); // new로 선언하면 주소에 있는 값들은 null값으로 자동 초기화 된다.
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

    m3(p); // call by reference
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
   }

  static void m3(Person p) { // 여기서 p는 메인 메서드의 p와는 다르게 m3에서만 일시적으로 사용할 변수
    p.name = "홍길동";
    p.age = 20;
    p.working = true;

  }

  static void m1 (int a) {
    a = 100; // a메모리 값을 100으로 넘겨라
  }

  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }
}

// 시험지 :
// 1. 다음 계산을 수행하라.
//  a 변수에 100을 넣어라.
//  b 변수에 200을 넣어라.
//  a와 b를 더해 그 결과를 출력하라.
