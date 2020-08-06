package com.eomcs.basic.oops_1;

public class Exam0150_3 {

  static class Student {

    static int count; // 모든 인스턴스가 공유하는 값을 저장할 때는 클래스 변수 사용한다. (스태틱 필드)

    String name;
    int age;
    // 각각 개별적으로 데이터를 관리하기 위해서는 인스턴스 주소를 사용해 해당 주소값을 참조하는 형식으로 한다.

  }

  public static void main(String[] args) {
    Student.count = 0;

    Student s1 = new Student();
    s1.name = "홍길동";
    s1.age = 10;

    Student.count++;

    Student s2 = new Student();
    s2.name = "임꺽정";
    s2.age = 12;

    Student.count++;

    Student s3 = new Student();
    s3.name = "장보고";
    s3.age = 19;

    Student.count++;

    System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
    System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
    System.out.printf("%d, %s, %d\n", Student.count, s3.name, s3.age);

    System.out.printf("%d\n", s1.count);
    System.out.printf("%d\n", s2.count);
    System.out.printf("%d\n", s3.count); // 클래스 변수이므로 레퍼런스 변수를 통해 접근하는 것은 옳지 못 하다.
    // 컴파일은 된다.
   }
}
