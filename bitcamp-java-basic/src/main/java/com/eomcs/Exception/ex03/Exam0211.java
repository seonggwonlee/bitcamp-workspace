package Exception.ex03;

public class Exam0211 {

	static void m1() throws Error {
		throw new Error();
	}
	
	static void m2() {
		throw new Error();
	}
	
	// Error 계열의 예외처리 경우 웬만해선 사용하지 않는 것이 좋다. => JVM 관련 오류
	// 만약 사용해야한다고 하면 메서드 선언부에 표시하는 것이 좋다. (생략 가능함)
	
	public static void main(String[] args) {
		
	}
}
