package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0470 {
	static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
		if (i == 0)
			throw new Exception();
		else if (i == 1)
			throw new RuntimeException();
		else if (i == 2)
			throw new SQLException();
		else if (i == 3)
			throw new IOException();
		else if (i < 0)
			throw new Error(); // 시스템 오류가 났을 때
	}
	
	public static void main(String[] args) {
		try {
			m(-1);
		} catch (Exception e) {
			System.out.println("애플리케이션 예외 발생");
		} catch (Error e) {
			System.out.println("시스템 예외 발생");
		}
	}
	// Error 계열의 시스템 예외를 받지 않는 것이 좋다.
	// 시스템 예외는 프로그램을 정상적으로 수행할 수 없을 정도의 오류이기 때문에
	// 정상적인 복구가 안되는 예외이다.
	// 이 예외를 처리하면 시스템이 멈추게 되므로 되도록 처리하지 않는 방향으로 가는 것이 좋다. 
}
