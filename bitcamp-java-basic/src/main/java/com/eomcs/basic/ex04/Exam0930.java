package com.eomcs.basic.ex04;

public class Exam0930 {

  public static void main(String[] args) {
    
    float f = 3.14f;
    int i = (int)f;
      System.out.println(i);
    
      
    double d = 9876.56789;
    long l = (long)d;
    System.out.println(l);
    // 부동소수점 변수를 정수 변수로 변환하기 위해선 명시적 형변환을 사용해야한다.
    
    // * 명시적 형변환
    // - 큰 메모리의 값을 작은 메모리로 변환시 필요
    // - 부동소수점을 정수로 변환시 필요
    // 구조 : 변수 = (바꾸고자하는타입) 변수 또는 값; 
  }
}
