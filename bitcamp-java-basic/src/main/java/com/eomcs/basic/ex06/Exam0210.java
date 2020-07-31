package com.eomcs.basic.ex06;

public class Exam0210 {

  public static void main(String[] args) {

    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;

    int type = GENERAL_MANAGER;
    // 상수를 따로 생성하여 가독성을 높였지만, 조건문에 사용할 int변수는 단순 변수이기 때문에 값 변경 가능
    // 따라서 잘못된 값을 집어 넣을 수 있다. 그것을 방지하는 것이 하단 enum 사용하는 문법이다.
    // 이것은 나중에 자세히 다룰 것.

    if (type == DEVELOPER) {
      System.out.println("정보처리자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) {
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) {
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }

    System.out.println("---------------");

    switch (type) { // 복잡한 조건은 if문이 낫다. 단순한 조건은 switch가 낫다.
      case DEVELOPER:
        System.out.println("정보처리자격증");



      case GENERAL_MANAGER:
        System.out.println("졸업증명서");


      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
    }

    System.out.println("---------------");

    int score = 70;

    switch (score) {

      case 100 :
      case 90:
        System.out.println("A");
        break;

      case 80:
      case 70:
        System.out.println("B");
        break;

      case 60:
      case 50:
        System.out.println("C");
        break;

      default:
        System.out.println("F");
    }

    System.out.println("---------------");

    String value = "developer";
    final String value2 = "developer";

    switch (value) { // 4byte 이하 정수 (byte, short, int, char), 문자열, 상
      case "developer":
        break;
      case "manager":
        break;
      case "ok" + "haha":
        break;
        default:
      // 상수 표현식 가능,
    }
    int value3 = 100;
    final int x = 200;

    switch (value3) {
      case 100:
        break;

      case 100 + 3:
        break;
      case x:
        break;
      case x + 3:
        break;
    }

    System.out.println("---------------");

    Job type2 = Job.DEV;

    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
      }

  } // main 메서드의 끝

  enum Job { // 상수 그룹 별도로 생성
    DEV, GM, BM, dd
  }
} // class의 끝