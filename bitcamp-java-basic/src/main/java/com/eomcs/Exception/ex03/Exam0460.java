package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0460 {
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
	
	public static void main(String[] args) {
		try {
			m(1);
		} catch (RuntimeException | SQLException | IOException e) {
			
		} catch (Exception e) {
			
		}
	}
	// | 연산자 이용하여 여러 개의 예외 처리를 묶어 받을 수 있다.
}