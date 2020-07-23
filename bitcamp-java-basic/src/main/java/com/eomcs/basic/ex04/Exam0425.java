package com.eomcs.basic.ex04;

public class Exam0425 {
  
  public static void main(String[] args) {
    
    float f1 = 99988.88f;
    float f2 = 11.11111f;
    
    System.out.println(f1);
    System.out.println(f2);
    
    float f3 = f1 + f2;
    System.out.println(f3);
    // 같은 타입을 연산하였더라도 그 결과값이 크기를 벗어나 출력값이 비정상적으로 출력된다.

    double d1 = 99988.88;
    double d2 = 99988.88;
    double d3 = d1 + d2;
    System.out.println(d3);
    // 따라서 웬만한 부동소수점 연산은 double로 처리하는 것이 편하고 안정적이다.
  }

}
