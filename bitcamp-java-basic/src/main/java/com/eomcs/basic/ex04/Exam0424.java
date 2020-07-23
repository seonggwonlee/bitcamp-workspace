package com.eomcs.basic.ex04;

public class Exam0424 {
  
  public static void main(String [] args) {
    
    float f;
    double d;
    
    f = 99999.8888877777f;
    System.out.println(f);
    // 리터럴 값이 이미 잘린 상태로 저장되기 때문에 잘못된 값이다.
    
    d = 99999.8888877777f;
    System.out.println(d);
    // 변수를 double로 바꿔 공간을 확보하였지만, 이미 리터럴 값이 잘못되었기 때문에 잘못된 값이 선언된다. 
    
    f = 99999.88f;
    System.out.println(f);
    
    d = 99999.8888877777;
    System.out.println(d);
    
    // 각 공간에 맞게 리터럴 값을 선
  }

}
