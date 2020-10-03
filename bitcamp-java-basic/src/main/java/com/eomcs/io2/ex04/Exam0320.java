package io2.ex04;

import java.io.FileInputStream;

public class Exam0320 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/test3.data");
		
		long value = (long)in.read() << 56;
		value += (long)in.read() << 48;
		value += (long)in.read() << 40;
		value += (long)in.read() << 32;
		value += (long)in.read() << 24;
		value += (long)in.read() << 16;
		value += (long)in.read() << 8;
		value += (long)in.read();
		
		in.close();
		
		System.out.printf("%x\n", value);
	}
}
