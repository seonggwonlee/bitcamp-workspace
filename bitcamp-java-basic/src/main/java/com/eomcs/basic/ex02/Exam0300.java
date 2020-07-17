// Exam0300.java
// 주제 : 애노테이션(annotation) 주석
// compiler나 JVM에게 뭔가 지시하는 주석

package com.eomcs.basic.ex02;

public class Exam0300 { 

     public static void main(String[] args) {
         
     }

    @Override // 기존 기능을 재정의하는 것이 맞는지 검사하라는 명령어
     public String toString() { // 기존에 있었던 것을 재정의
         return "test";
     }

}