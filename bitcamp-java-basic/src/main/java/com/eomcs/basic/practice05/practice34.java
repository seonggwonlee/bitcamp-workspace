package com.eomcs.basic.practice05;

public class practice34 {

  public static void main (String[] args) {
    
    final int CSS           = 0x01;
    final int HTML          = 0x02;
    final int PHP           = 0x04;
    final int Python        = 0x08;
    final int JAVASCRIPT    = 0x10; // 0001 0000
    final int JAVA          = 0x20; // 0010 0000
    final int CPP           = 0x40; // 0100 0000
    final int C             = 0x80; // 1000 0000
    
    int lang = C | JAVA | Python | HTML;
    
    System.out.printf("CSS : %b\n", (lang & CSS) == CSS);
    System.out.printf("HTML : %b\n", (lang & HTML) == HTML);
    System.out.printf("PHP : %b\n", (lang & PHP) == PHP);
    System.out.printf("Python : %b\n", (lang & Python) == Python);
    System.out.printf("JAVASCRIPT : %b\n", (lang & JAVASCRIPT) == JAVASCRIPT);
    System.out.printf("JAVA : %b\n", (lang & JAVA) == JAVA);
    System.out.printf("CPP : %b\n", (lang & CPP) == CPP);
    System.out.printf("C : %b\n", (lang & C) == C);
    
    // lang으로 나온 결과값을 AND 연산자를 통해 결과하여
    // 조사값이 같지 않으면 해당 비트가 0이라는 걸 표현 
    
    
    
  }
}
