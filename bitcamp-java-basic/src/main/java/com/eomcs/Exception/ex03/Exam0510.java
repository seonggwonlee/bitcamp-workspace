package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0510 {

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
			throw new Error();
	}
	
	public static void main(String[] args) {
		try {
			m(0);
			System.out.println("try");
		} catch (RuntimeException | SQLException | IOException e) {
			System.out.println("catch 1");
		} catch (Exception e) {
			System.out.println("catch 2");
		} finally {
			System.out.println("finally");
		}
	}
	// 정상적으로 실행하든, 예외가 발생하여 catch 블록을 실행하든 finally 블록은 무조건 실행한다.
	// try ~ catch ~ 블록을 나가기 전에 무조건 실행하게 된다. 
	// 이 블록에서는 try에서 사용한 자원을 해제시키는 코드를 주로 포함시킨다.
	// 자원 : 파일, DB커넥션, 소켓커넥션, 대량의 메모리 등 
}
