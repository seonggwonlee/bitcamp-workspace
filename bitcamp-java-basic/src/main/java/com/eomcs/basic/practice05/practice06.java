package com.eomcs.basic.practice05;

public class practice06 {
  
  public static void main (String[] args) {
    
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    
    int r1 = x + y;
        System.out.println(r1); // 출력값 : -2
        // int 타입은 4바이트이므로 최대값을 서로 더하면 범위를 넘어가게 된다.
        // 그렇게되면 의도치 않은 결과값이 출력될 수 있다.
    
    long r2 = x + y;
    System.out.println(r2);
    // x + y의 값이 int의 범위를 넘어가기 된다.
    // 저장되는 장소를 long으로 바꾼다고 해도
    // 이미 x y는 int 변수로 선언이 되었고, 산술연산결과값이 int값이므로
    // long에는 int타입으로 저장되게 되고 이로써 결과는 -2가 그대로 출력하게 된다.
    
    r2 = (long)x + (long)y;
    System.out.println(r2);
    // 정상적인 값 출력
    
  }

}
