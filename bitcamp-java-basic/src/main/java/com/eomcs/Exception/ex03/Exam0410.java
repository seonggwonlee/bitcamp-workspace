package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0410 {
	static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
		if (i == 0) 
			throw new Exception();
		else if (i == 1)
			throw new RuntimeException();
		else if (i == 2)
			throw new SQLException();
		else 
			throw new IOException();
	}
	
	public static void main(String[] args) {}
	m(1);
	
	// 예외를 던질 수 있다는 메서드 선언 후 호출 시
	// 예외 상황에 대한 처리를 하지 않으면 컴파일 오류 발생
}
