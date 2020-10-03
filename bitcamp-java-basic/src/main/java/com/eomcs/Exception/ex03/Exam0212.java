package Exception.ex03;

public class Exam0212 {
	static void m1() throws Exception {
		throw new Exception();
	}
	
	static void m2() {
		throw new Exception();
	}
	
	static void m3() throws String {
		throw new String(); 
	}
	
	// Exception 계열이 개발자가 애플리케이션을 작성하며 예외를 던질 때 사용한다.
	// 단, 메서드 선언부에 반드시 Exception 예외를 표시해야하고
	// throws에 선언할 수 있는 클래스는 Throwable 타입만 가능하다.
	
	public static void main(String[] args) {
		
	}
}
