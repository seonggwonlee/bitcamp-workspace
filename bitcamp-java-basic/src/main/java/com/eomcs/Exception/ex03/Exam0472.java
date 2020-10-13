package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0472 {
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
		}
	}
	
	// Exception 변수를 사용하게 되면 애플리케이션 예외 처리만 하고
	// 시스템 예외는 main()호출자에게 위임하게 된다. (JVM에 전달)
}
