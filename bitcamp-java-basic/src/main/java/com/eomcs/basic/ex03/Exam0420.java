// Exam0240.java
// 주제 : 정수값을 메모리에 저장하는 방법

package com.eomcs.basic.ex03;

//# 문자 리터
public class Exam0420 {

    public static void main(String[] args) {
      
      // 자바는 문자를 메모리에 저장할 때 Unicode 규칙에 따라 2바이트 코드로 저장한다. 

        System.out.println('A');
        System.out.println('가');
        System.out.println('\u0041'); // Unicode 직접 지정 - 키보드로 직접 입력할 수 없을
        
        System.out.println("0x41");
        System.out.println("65");
        
        
        
     }
}

