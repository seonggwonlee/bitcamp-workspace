package com.eomcs.basic.ex04;

public class Exam0821 {
  
  public static void main(String[] args) {
    
    int a = 100;
    
//    for (int a = 0; a < 10; a++) { 바깥 블록에서 사용된 변수명을 사용할 수 없다. 
//      int a;
//      
//    }
    
    for (int i = 0; i < 10; i++) {
      int sum;
      sum = a + i;
        System.out.println(sum);
    }
    System.out.println(a);
  }

}
