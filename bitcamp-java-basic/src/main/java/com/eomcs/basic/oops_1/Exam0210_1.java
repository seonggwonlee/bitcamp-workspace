package com.eomcs.basic.oops_1;

public class Exam0210_1 {

  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    Calculator c3 = new Calculator();
    Calculator c4 = new Calculator();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(21867482);
    c1.divide(12);

    c2.plus(111);
    c2.plus(99);
    c2.minus(2351);
    c2.multiple(2582);
    c2.divide(34);

    c3.plus(2);
    c3.plus(2);
    c3.minus(1);
    c3.multiple(3);
    c3.divide(2);

    c4.plus(2);
    c4.plus(3);
    c4.minus(1);
    c4.multiple(482);
    c4.divide(4);

    printResult(c1.result);
    printResult(c2.result);
    printResult(c3.result);
    printResult(c4.result);
  }

  static void printResult(int total) {
    System.out.println("---------");
    System.out.printf("결과 값 ----> %d\n", total);
    System.out.println("---------");
  }

  static class Calculator {

    int result = 0;

    void plus(int a) {
      this.result += a;
    }
    void minus(int a) {
      this.result -= a;
    }
    void multiple(int a) {
      this.result *= a;
    }
    void divide(int a) {
      this.result /= a;
    }
  }
}
// result를 인스턴스 변수로 선언했으니 메서드들도 인스턴스 메서드로 활용하는 것이 훨씬 효율적이다.
// 메서드를 인스턴스 메서드를 사용했을 때 메서드 호출 시 파라미터 값을 넘겨주지 않아도 된다.
// 메서드 호출 시 각 선언된 레퍼런스 변수를 이용, 메서드를 참조한다.
// non-static 사용하면 자동으로 인스턴스의 주소 값을 가진 this변수가 생성된다.
// 따라서 인스턴스 변수를 this변수를 통해 참조하여 쓰면 된다.