package io2.ex04;

import java.io.FileInputStream;

public class Exam0220 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/test3.data");
		
		// Exam02_1을 실행하여 출력한 데이터를 read()로 읽는다.
		// 파일에서 4바이트를 읽어 4바이트 int 변수에 저장한다. 
		int value = in.read() << 24;
		value += (in.read() << 16);
		value += (in.read() << 8);
		value += in.read();
		
		in.close();
		
		System.out.printf("%x\n", value);
	}
}
