package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0430 {
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
			System.out.println("실행 성공");
		} catch (IOException e) {
			System.out.println("IOException 예외 처리 발생");
		} catch (SQLException e) {
			System.out.println("SQLException 예외 처리 발생");
		} catch (RuntimeException e) {
			System.out.println("RuntimeExcepiton 예외 처리 발생");
		} catch (Exception e) {
			System.out.println("기타 예외 처리 발생");
		}
	}
}
