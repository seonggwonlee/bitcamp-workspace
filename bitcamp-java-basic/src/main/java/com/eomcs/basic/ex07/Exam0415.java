package com.eomcs.basic.ex07;

public class Exam0415 {

  public static void main(String[] args) throws Exception {
    int result = 1;

    int n = 5;

    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);

    System.out.println("---------------------");

    result = factorial(5);
    // result = 5 * factorial(4)
    // result = 5 * 4 * factorial(3)
    // result = 5 * 4 * 3 * factorial(2)
    // result = 5 * 4 * 3 * 2 * factorial(1)
    // result = 5 * 4 * 3 * 2 * 1 * factorial(0)
    System.out.println(result);
  }
  static int factorial(int n) {
    if (n == 1) { // 재귀 호출 : 수학식을 그대로 갖고오기 때문에 직관적이고 간결하다 그러나 실행속도가 느려진다
      return 1;
    }
    return n * factorial(n - 1); // 자기 자신을 호출한 순간 factorial(n - 1)메모리가 새로 생성된다.
    // 즉 호출할 때마다 새로운 메모리가 생성된다 => 스택이 많이 쌓인다.
    // 메서드가 호출되기 때문인 것이다.


  }
}
