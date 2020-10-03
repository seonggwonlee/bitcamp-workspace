package io2.ex02;

import java.io.FileInputStream;

// 바이트 단위로 읽기
public class Exam0120 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/test1.data");
		// 1) 파일의 데이터를 읽을 객체 준비
		
		int b = in.read();
		// 2) 1바이트 읽기
		// read() 메서드의 리턴 타입이 int라 하더라도 1바이트를 읽어 리턴한다.
				
		in.close();
		
		System.out.printf("%x\n", b);
	}
}
