package com.eomcs.basic.ex04;

public class Exam0400 {

  public static void main(String[] args) {
    // 정수
    byte b;
    short s;
    int i;
    long l;
    
    // 부동소수점
    float f;
    double d;
    
    // 문자
    char c;
    
    // 논리
    boolean bool;
    
    
    // 레퍼런스
    String str;
    
    // 변수의 메모리 크기
    // 정수 리터럴은 기본이 4byte이다.
    // 기본적으로 큰 메모리 값 작은 메모리에 저장할 순 없지만,
    // 오른쪽 값이 4바이트 정수 리터럴일 경우 메모리에 해당 리터럴을 저장할 수 있다면 허락한다.
    // ex) byte는 1바이트(8비트)이므로 -128~127까지 저장가능하다. 따라서 그 사이 값을 저장가능.
    // 8byte 정수 리터럴은 해당되지 않음.
    b = -128;
    b = 127;
    
    // b = -129;
    // b = 128;
    
    b = 20 + 30;
    b = 20 * 3;
    // 리터럴 끼리의 연산 결과는 리터럴로 취급한다.
    
    b = 120 + 7; // 가능하다
    // b = 120 + 8; // 불가능하다.
    
    byte b2 = 20;
    // b = 100 + b2; // 리터럴과 변수의 연산 결과는 변수로 취급한다.
    
    s = -32768;
    s = 32767;
    // s = -32769;
    // s = 32768;
    
    i = -21_0000_0000;
    i = 21_0000_0000;
   // i = -22_0000_0000;
   // i = 22_0000_0000;
    
    l = -922_0000_0000_0000_0000L; // 정수 리터럴은 4바이트이므로 8바이트를 알려주는 L 적어야함.
    l = 922_0000_0000_0000_0000L;
   // l = -932_0000_0000_0000_0000L;    
   // l = 932_0000_0000_0000_0000L;
    
   /* b = 100L;
    s = 100L;
    i = 100L;*/ 
    // 8byte 정수 리터럴은 작은 메모리에 초기화할 수 없다.
    
    byte b3;
      b3 = b;
//    b3 = s;
//    b3 = i;
    
    short s2;
    s2 = b;
    s2 = s;
    // s2 = i;
    // s2 = l;
    
    int i2;
    i2 = b;
    i2 = s;
    i2 = i;
    // i2 = l;
    
    long l2;
    
    l2 = b;
    l2 = s;
    l2 = i;
    l2 = l; // 큰 메모리 값에 작은 메모리값은 담을 수 있다.
    
    s = -32768;
    s = 32767;
    char c2;
    //c2 = -32768; // 음수 불가능
    c2 = 0;
    c2 = 65535;
    // c2 = 65536;
    
    //c2 = s;
    //s = c2;
    
    f = 999.9999f;
    f = 9.999999f;
    f = 999999.9f;
    
    // 부동소수점은 7자리 까지의 숫자만 유효하다.
    // 그 이상의 자릿수인 경우 값이 버려진다. 또는 반올림 처리된다.
    // 유효 자릿수를 초과한다고 오류가 발생하지는 않는다. 
    // 그렇다고 문제가 없는 건 아니기 때문에 주의할것 
    
    f = 999.99993f;
    System.out.println(f);
    
    float f1 = 1.234567f;
    float f2 = 92345.22f; 
    float f3 = f1 + f2; // 12346.454567 => 7자리가 넘어간다. 따라서 값이 버려진다.
    double dx = f1 + f2; // float 끼리의 연산 결과값은 float 이므로 이미 값이 잘려진 상태이기
    // 때문에 double을 사용해도 소용없다.
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(dx);
    
    // 두 부동소수점을 연산한 결과값이 7자리를 넘어갈 거 같다면 처음부터 double 사용하는 것이 좋다.
    double d1 = 1.234567;
    double d2 = 92345.22; 
    double d3 = d1 + d2;
    System.out.println("==>");
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    
    d = 799999299.99999997; // 17자리는 불가능
    System.out.println(d);
    
    // f = 2345678912.123456;
   // f = 9999999999.999999;
    f = 2345678912.123456f; // 8byte값을 4byte로 만든다. => 4바이트 넘어가는 값을 자른다.
    // => 따라서 f에 들어가는 값은 이미 잘린 값이다.
    // 값이 저장되면서 잘린 것이 아니다.
    System.out.println(f);
    
    d = 234.5678;
    System.out.println(d);
    
    d = 234.5678f;
    System.out.println(d); // 부동소수점은 복잡한 연산을 동원하기 때문에 정상적인 값을 출력하지 않는다. 
    // 따라서 작은 메모리를 큰 메모리 값에 저장한다면 정상적인 값이 출력하지 않는다.  
    // 부동소수점은 같은 메모리에서만 다루는 것이 좋다.
    
    d = f;
    System.out.println(d);
  }
}
