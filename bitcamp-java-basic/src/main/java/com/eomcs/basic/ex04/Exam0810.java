package com.eomcs.basic.ex04;

public class Exam0810 // 클래스 선언  
{ // 클래스 블록 => 클래스 정의
  static int x;

  public static void main(String[] args) // 메서드 선언  
  { // 메서드 블록 => 메서드 정의 
    
    
    int x; 
    int a;
    // 같은 블록에 로컬 변수가 아니라면 같은 이름으로 변수를 선언할 수 있다. static과는 다른 변수
    
    // int a; // 컴파일 오류 => 문법 오류
    // 같은 블록에 이름이 같은 변수를 중복 선언할 수 없다. 
    
    { // 로컬 블록
      // int a; // 바깥 블록에 선언된 변수와 같은 이름을 가질 수 없다.
      int b; 
      {
        // int b; // 바깥 블록에 선언된 변수와 같은 이름의 변수를 선언할 수 없다.
        // int a; // 마찬가지로 되지 않는다.
        int c; // 블록 안에 선언된 변수는 블록을 나가는 순간 자동삭제된다.
        int d;
      }
      //c = 100; // 컴파일 오류
      int c; // 따라서 해당 변수는 위 블록에서 선언한 c변수와 다르다.
      {
        int d; // 이전 블록에서 만든 d 변수는 이미 삭제되었기 때문에
        // 이 블록에서 같은 이름으로 변수를 만들 수 있다.
      }
      b = 100;
      c = 200;
      a = 300;
    }
    int i;
    for (i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println(i);
    
    for (int k = 0; k < 10; k++) {
      System.out.println(k);
    }
    // System.out.println(k); k는 for문에서 선언한 것이기 때문에 밖에서는 쓸 수 없다. 
    
    int age = 20;
    int m = 0;
    
    if (age > 20) {
      m = 200;
      int n = 300;
    }
    System.out.println(m); // 변수 m이 초기화 하지 않은 상태에서 if문 실행하면 age가 변수이기 때문에 어떤 값이 올지 몰라 컴파일이 정확한 판단 불가함 
    // System.out.println(n); // 컴파일 오류 
  } // 메인 메서드 블록 끝
} // 클래스 블록 끝
