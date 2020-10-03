package io2.ex09.step3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Exam0210 {
	public static void main(String[] args) throws Exception {
		FileInputStream fileIn = new FileInputStream("temp/jls11.pdf");
		BufferedInputStream in = new BufferedInputStream(fileIn);
		
		int b;
		
		long startTime = System.currentTimeMillis();
		
		int callCount = 0;
		while ((b = in.read()) != -1) 
			callCount++;
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		System.out.println(callCount);
		
		in.close();	
	}
}
