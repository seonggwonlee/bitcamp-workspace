package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0320 {
	static void m(int i) throws Exception {
		if (i == 0) 
			throw new Exception();
		else if (i == 1)
			throw new RuntimeException();
		else if (i == 2)
			throw new SQLException();
		else 
			throw new IOException();
	}
	
	// Exception이 수퍼 클래스로 Exception 하나만 선언하면 그 하위 클래스를 전부 선언할 수 있다.
	// 그러나 예외 처리시 하위 클래스를 전부 선언하는 것이 유지보수에 좋기 때문에
	// 가능한 모두 나열하는 것이 좋다.
}
