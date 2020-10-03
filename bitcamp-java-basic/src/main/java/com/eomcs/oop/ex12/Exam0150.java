package oop.ex12;

public class Exam0150 {

	interface Calculator {
		int compute(int a, int b);
	}
	
	public static void main(String[] args) {
		Calculator c1 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(c1.compute(10, 20));
		// 리턴 값은 리턴 명령어 사용한다.
		
		Calculator c2 = (a, b) -> a - b;
		System.out.println(c2.compute(10, 20));
		// 한 문장으로 표시되는 표현식의 경우 괄호생략 가능
		// 괄호생략 시 리턴 명령어도 같이 생략하여야 한다.
		
		Calculator c3 = (a, b) -> Math.max(a, b);
		System.out.println(c3.compute(10, 20));
		// Math.max()는 int값을 리턴한다 => 표현식 = 괄호 생략 가능
		
		
	}
}
