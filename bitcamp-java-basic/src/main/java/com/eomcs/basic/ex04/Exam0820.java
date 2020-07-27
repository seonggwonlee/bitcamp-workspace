package com.eomcs.basic.ex04;

public class Exam0820 {

  public static void main (String[] args) {
    
    int a = 100;
    
    {
      // int a; 메서드 블록 안에서 같은 이름의 변수 선언은 불가하다. 
      
      a = 200; // 안쪽 블록에서는 바깥 블록의 변수를 사용할 수 있다. 
      
      int b = 300;
      // 해당 블록에서 선언된 변수는 블록 밖에서는 제거된 상태가 된다. 
    }
    System.out.println(a);
    
    {
    int b = 400; // 이전 블록에서 b 변수는 제거되었기 때문에 해당 블록에서 다시 선언할 수 있다.  
    System.out.println(b);
    }
        
  }
}
