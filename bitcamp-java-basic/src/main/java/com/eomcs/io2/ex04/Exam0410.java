package io2.ex04;

import java.io.FileOutputStream;

public class Exam0410 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream out = new FileOutputStream("temp/test3.data");
		
		String str = "ABC가각간";
		
		// str.getBytes(문자코드표)
		// => 문자열을 지정한 문자코드표에 따라 인코딩하여 바이트배열을 만든다.
		out.write(str.getBytes("UTF-8"));
		// str.getBytes("UTF-8") => JVM의 기본 인코딩 방식인 UCS2에서 UTF-8문자코드로 인코딩
		
		out.close();
		
		System.out.println("데이터 출력 완료");
	}
}
