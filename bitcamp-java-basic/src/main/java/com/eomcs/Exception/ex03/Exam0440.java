package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0440 {
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
		} catch (Exception e) {
			
		} catch (IOException e) {
			
		} catch (SQLException e) {
			
		} catch (RuntimeException e) {
			
		}
	}
	// 여러 개의 예외를 받을 때 수퍼 클래스 변수로 먼저 받게 되면
	// 해당 클래스의 모든 서브 클래스 객체를 다 받게 되므로
	// 서브 클래스의 변수에서 받을 기회조차 없어지게 된다.
}