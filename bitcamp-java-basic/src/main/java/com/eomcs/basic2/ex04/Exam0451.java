package com.eomcs.basic2.ex04;

// 레퍼런스 변수
public class Exam0451 {
 	public static void main(String[] args) {
 		java.util.Date d1 = new java.util.Date();
 		java.util.Date d2 = d1;
 		
 		System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
 		
 		d1.setDate(22);
 		
 		System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
 	}
}
// d1에 저장된 값을 변경 후 d2에 저장된 값을 출력하면 d1과 같은 값으로 되어있다.
// d2는 d1의 값을 저장하는 것이 아닌, d1의 저장된 위치(주소)를 가리키는 변수로서 사용된 것이다.
// 이런 변수를 레퍼런스 변수라고 부른다.
// 자바의 기본 데이터 타입을 제외한 모든 타입의 변수는 레퍼런스이다.
