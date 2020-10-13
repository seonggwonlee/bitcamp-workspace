package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0471 {
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
		} catch (Throwable e) {
			System.out.println("애플리케이션 예외 발생");
		}
	}
	
	// catch문 작성 시 변수를 Throwable로 받게 되면 시스템 오류인 Error까지 받기 때문에
	// JVM에서 발생된 오류에 대해서도 예외 처리를 하게 된다.
	// 시스템 오류는 애플리케이션으로 해결할 수 없으므로 실무에서는 Throwable 변수를 사용하지 않는다.
}
