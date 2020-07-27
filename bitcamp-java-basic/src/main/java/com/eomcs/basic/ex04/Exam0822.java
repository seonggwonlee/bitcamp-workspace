package com.eomcs.basic.ex04;

public class Exam0822 {

  public static void main(String[] args) {
    
    int a = 100; 
    
    switch (a) {
      case 1:
      
// int a; // switch 바깥 쪽 같은 변수가 존재 => 컴파일 오류
// case 내에서 선언된 변수는 switch문 소속이 된다.
        int b; // 바깥 블록에서 선언되지 않았으므로 해당 블록에서 선언 가능 
        {
          int c; // c는 해당 블록의 변수가 된다. 
        }
        break;
        
      case 2:
        // case2는 다른 블록으로 취급하지 않는다. 
        // 위쪽 case에서 선언된 변수는 switch소속이기 때문에 다른 case에서도 사용할 수 없다.
        // int b; // 해당 변수는 case 1에서 선언하였기 때문에 선언 불가
        int c;
        
        break;
        
      case 3:
      for (int i = 0; i < 100; i++) {
         // int b; // for문 바깥 블록(switch 문)에서 이미 선언되었기 때문에 선언 불가
      }
      break;
     default:
    }
  }
}
