package com.eomcs.basic.practice05;

public class practice12 {

  public static void main (String[] args) {
    
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    // 10진수 그대로 연산한다면 위 결과는 true가 나와야한다.
    // 하지만 부동소수점 계산은 정확하지 않으므로 값의 왜곡이 발생할 수 있다.
    // 따라서 결과는 false가 나오게 된다.
    
    System.out.println(d1 + d2);
    // 위와 마찬가지로 계산 결과가 정확하지 않다. (의도치 않은 값이 출력된다.)
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);
    
    System.out.println(x + y);
    // 해당 연산 결과는 정확하게 출력한다.
    // 이렇게 2진수 계산은 그때그때다르다.
    
    double EPSILON = 0.000001; // 해당 변수를 기준으로 부동소수점 비교
    System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
    
    // Math.abs로 산술 연산 결과값을 절대값으로 만든 후
    // 각 부동소수점 연산 결과 값을 빼기 하여 나온 값이
    // EPSILON보다 작으면 두 결과값은 서로 같은 것으로 본다.
    // EPSILON 값은 각 기준에 맞춰서 적용하면 된다.
    
  }
}
