package com.eomcs.basic.practice05;

public class practice08 {

  public static void main(String[] args) {
    
    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = 5.5f;
    double d = 6.6;
    boolean bool = true;
    char c = 7;
    
    // 자바에서 연산 최소 단위는 4바이트로 int이다.
    // 그보다 작은 타입으로 연산할 경우 자바 내에서 int로 자동 형변환 수행한다.
    // 이를 암시적 형변환(implicit type conversion)이라고 부른다.
    // 데이터 타입이 다른 각각의 리터럴을 연산하고자 하는 경우에도 암시적 형변환 수행 후 연산하게 된다.
        
    // 암시적 형변환은 자바 내 규칙성에 따라 작동한다.
    // byte, short, char => int => long => float => double
    
    // byte r1 = b + b;
    // b가 byte이고 산술연산시 암시적형변환으로 인해 int로 바뀐다.
    // 변수는 큰 메모리에서 작은 메모리에 저장할 수 없기 때문에 컴파일 오류 출력.
    
    // short r2 = s + s;
    // 위와 마찬가지
    
    // short r3 = b + s;
    // byte와 short 각각 다른 데이터 타입의 연산이지만 결과 타입은 int로 형변환된다.
    // 따라서 short 변수에 저장할 수 없다.
    
    int r4 = b + i;
    // b는 byte, i는 int이므로 암시적 형변환 규칙에 의해 byte는 int 타입이 되고 최종
    // 연산 결과 타입은 int가 된다. 따라서 결과값을 int 변수에 저장할 수 있다.
    
    int r5 = s + i;
    // 위와 마찬가지로 short가 int로 암시적 형변환하여 저장 가능하다.
    
    // int r6 = i + l;
    // int가 long으로 암시적 형변환 되어 최종적으로 long타입의 결과값이 나온다.
    // 따라서 int변수에 저장할 수 없기 때문에 컴파일 오류
    
    // long r7 = l + f;
    // long이 float으로 암시적 형변환하여 최종 데이터 타입은 float이 된다.
    // 따라서 부동소수점은 정수 변수에 저장할 수 없으므로 컴파일 오류 
    
    // float r8 = f + d;
    // float이 암시적 형변환으로 인해 double로 형변환 된다. 따라서 최종 데이터타입은 double
    
    // long r9 = b + s + i + l + f + d;
    // double이 들어간 산술연산으로 모든 연산의 결과값은 최종적으로 double이 된다.
    // 따라서 double 타입의 결과값을 long에 저장할 수 없으므로 컴파일 오류.
    
    // int r10 = bool + i;
    // 산술연산자는 논리값을 연산할 수 없다. 정수와 부동소수점만 가능하다.
    
    
    
    
  }
}
