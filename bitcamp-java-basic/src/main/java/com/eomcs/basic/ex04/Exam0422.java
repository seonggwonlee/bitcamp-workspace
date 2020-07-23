package com.eomcs.basic.ex04;

public class Exam0422 {
  
  public static void main (String[] args) {
    
    double d;
    // 유효자릿수 15자리 부동소수점 저장 가능, (간혹 최대 16자까지 가능하다)
    
    
    d = 9.99999999988888;
    System.out.println(d);
    
    d = 9999999.88888888;
    System.out.println(d);
    
    d = 99999999998888.8;
    System.out.println(d);
    // 소수점을 제외한다면 숫자의 개수가 15개이므로 정상 출
    
    d = 0.00000999999999988888;
    System.out.println(d);
    // 소수점을 제외했을 때 앞에 0만 있을 경우 0은 자릿수에서 제외한다.
    
    d = 9.999999999999997;
    System.out.println(d);
    
    d = 999999999999999.7;
    System.out.println(d);
    // 여기 까지 유효자릿수가 넘어가므로 정상적으로 값을 저장할 수 없다.
  }
}
