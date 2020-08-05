package com.eomcs.basic.oops_1;

public class Exam0240 {

  static class Calculator {

    int result = 0;

    static void plus(Calculator that, int value) { // Calculator 인스턴스 변수의 값을 담을 레퍼런스 변수 준비
      that.result += value; // Calculator 인스턴스에 result 변수로 찾아가 값을 저장
    }
    static void minus(Calculator that, int value) {
      that.result -= value;
    }
    static void multiple(Calculator that, int value) {
      that.result *= value;
    }
    static void divide(Calculator that, int value) {
      that.result /= value;
    }
    // 작업결과를 개별적으로 관리하고 싶을 땐 인스턴스 변수를 사용한다.
    // 인스턴스 변수는 new명령어로 생성한다. 따로 클래스가 로딩될 때 생성되지는 않는다.
    // 변수 선언 앞에 static이 붙지 않는다.
    // 해당 클래스는 계산을 1개 씩 밖에 하지 못한다. => class 변수 선언을 1개 밖에 못 하기 때문
    // 따라서 인스턴스 변수로 선언하여 주소값을 참조할 수 있게 한다.



  }
  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    // c1과 c2라는 Calculator 인스턴스 변수(주소값)를 가리키는 레퍼런스 변수를 선언한다.

    Calculator.plus(c1, 2);
    Calculator.plus(c1, 3);
    Calculator.minus(c1, 1);
    Calculator.multiple(c1, 7);
    Calculator.divide(c1, 3);

    Calculator.plus(c2, 4);
    Calculator.plus(c2, 1);
    Calculator.minus(c2, 3);
    Calculator.multiple(c2, 55);
    Calculator.divide(c2, 2);

    // 계산식 2개 이상을 한꺼번에 돌리기 위해 인스턴스 변수로 선언된 Calculator 클래스를 참조한다.

    System.out.printf("결과 : %d\n", c1.result);
    System.out.printf("결과 : %d\n", c2.result);

  }
}

