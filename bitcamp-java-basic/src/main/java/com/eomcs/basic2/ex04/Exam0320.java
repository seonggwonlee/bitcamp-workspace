package com.eomcs.basic2.ex04;

public class Exam0320 {
	public static void main(String[] args) {
		int age1 = 20;
		
		int age2 = age1;
		
		age1 = 30;
		
		System.out.println(age1);
		System.out.println(age2);
	}
} 
// 다른 변수의 값을 저장할 때도 사용 가능하다.
// 의미는 age1의 값을 age2로 복사하는 것이다.
