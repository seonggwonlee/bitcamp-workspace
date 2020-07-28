package com.eomcs.basic.practice05;

public class practice16 {

  public static void main(String[] args) {
    
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    // &&은 AND 연산자로 두 논리값이 모두 참이어야만 참이다.
    // r 값은 이미 a가 false로 선언되었기 때문에 결과적으로 false가 될 수밖에 없다.
    // &&은 실행 전 결과를 알 수 있다면 오른쪽 논리값을 연산하지 않는다.
    // 즉, 효율적으로 실행이 가능하다. 따라서 r은 false 값이 출력하고 b는 true가 선언되지
    // 않았으므로 false가 유지된다.
    
    a = false;
    b = false;
    r = a & (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    // & 연산자 역시 AND 연산자로 두 논리값이 참이어야만 참이다.
    // 그러나 &&와 다르게 결과값을 미리 알 수 있다고 해도 오른쪽 문장을 실행하게 된다.
    // 따라서 r은 false를 출력하게 되나,  b에 true가 선언되었으므로 b는 true 값을 가지게 된다.
    
    a = true;
    b = false;
    r = a || (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    // 위와 같은 이유
    
    a = true;
    b = true;
    r = a | (b = false);
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    //즉 &&, ||은 앞에 있는 피연산자로 결과값을 알 수 있다면 뒤 명령은 실행하지 않는다.
    // &와 |는 앞에 있는 피연산자로 결과값을 알 수 있더라도 뒤 명령을 모두 실행한다.
    
  }
}
