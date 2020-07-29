package com.eomcs.basic.practice05;

public class practice35 {

  public static void main (String [] args) {
    
    int age = 12;
    
    // (age > 18) ? System.out.println("성인") : System.out.println("미성년");
    // ?는 조건 연산자로 구조는 " 조건 ? 표현식1 : 표현식2 " 이다.
    // 표현식은 결과가 확실히 만들어지는 문법에 의거한다.
    // 따라서 위 문장은 System.out.println이 결과를 만들어내는 표현식으로 볼 수 없기 때문에 식이 성립되지 않는다.
    
    String message = (age > 18) ? "성년" : "미성년";
    System.out.printf("나이 %d는(은) %s이다.\n", age, message);
    
    //  문장 : 작업을 수행시키는 명령어
    // 표현식 : 작업을 수행 후 결과 리턴하는 명령어
    // 문장과 표현식의 관계 : 문장 중 결과를 리턴하는 문장을 표현식이라고 한다.
    

    
  }
}
