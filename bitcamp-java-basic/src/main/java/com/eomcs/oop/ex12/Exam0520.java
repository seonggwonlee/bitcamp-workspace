package oop.ex12;

public class Exam0520 {
	static class MyCalculator {
		public static int plus(int a, int b) {
			return a + b;
		}
		
		public static int minus (int a, int b) {
			return a - b;
		}
		
		public static int multiple (int a, int b) {
			return a * b;
		}
		
		public static int divide (int a, int b) {
			return a / b;
		}
	}
	
	static interface Calculator {
		int compute (int a, int b);
	}
	
	public static void main(String[] args) {
		// 스태틱 메서드 레퍼런스로 인터페이스 구현체 생성
		
		Calculator c1 = MyCalculator::plus;
		// 클래스명::메서드명;
		// 위 문장은 컴파일러가 아래와 같은 문장으로 만든다.
		
		//		Calculator c1 = new Calculator() {
		//			@Override
		//			public int compute(int a, int b) {
		//				return MyCalculator.plus(a, b);
		//			}
		//		}
		// 기존 메서드가 메서드 레퍼런스로 전달 가능한지 여부는 위 코드를 참고
	System.out.println(c1.compute(200, 17));	
	}
	
	// 인터페이스에 정의된 메서드(예:compute())가 호출 되었을 때,
	// 그 파라미터 값은 메서드 레퍼런스로 지정된 스태틱 메서드(예:plus())에게 전달될 것이다.
	// 따라서 스태틱 메서드의 파라미터는 항상 인터페이스 메서드에 정의된 파라미터 값을 받을 수 있어야 한다.
	
}
