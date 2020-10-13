package io2.ex02;

import java.io.FileInputStream;

public class Exam0220 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/test1.data");
		
		byte[] buf = new byte[100];
		
		int count = in.read(buf);
		
		in.close();
		
		System.out.printf("읽어들인 바이트 수 출력 : %d\n", count);
		
		for (int i = 0; i < count; i++) {
			System.out.printf("%x ",buf[i]);
			
			System.out.println();
		}
		
		
	}
}
