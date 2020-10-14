package oop.ex12;

public class Exam0331 {

	static interface Calculator {
		int compute (int a, int b);
	}
	
	static void test(Calculator c) {
		System.out.println(c.compute(100, 200));
	}
	
	public static void main(String[] args) {
		test(new Calculator() {
			@Override
			public int compute(int a, int b) {
				int sum = 0;
					for (int i = 0; i < b; i++) {
						sum += i;
					}
				return sum;
			}
		});
		// 익명 클래스로 정의
	}
}