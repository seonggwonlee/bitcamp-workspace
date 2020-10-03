package Exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0310 {

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
	
	// 메서드에 발생되는 예외는 메서드 선언부에 전부 나열해야 한다. 
	
	public static void main(String[] args) {
		
	}
}
