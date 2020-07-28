package com.eomcs.basic.practice05;

public class practice02 {

  public static void main(String[] args) {
    
    System.out.println(2 + 3 * 7);
    System.out.println(3 * 7 + 2);
    // *, /, %는 +, -보다 먼저 계산된다. 
    
    System.out.println(3 * 8 / 2);
    System.out.println(8 / 2 * 3);
    // 같은 우선순위의 연산자는 실행 순서가 바뀌더라도 상관없다.
    
    System.out.println((2 + 3) * 7);
    // 우선순위를 강제하고 싶다면 괄호로 묶어야한다.
    
    }
}

/* 
 * 연산자 우선 순위 (위에서 아래로)
 * 괄호: ()
 * 후위 연산자: a++, a--
 * 전위 연산자: ++a, --a, 단향 연산자(+, -)
 * %, *, /
 * +, -
 */

