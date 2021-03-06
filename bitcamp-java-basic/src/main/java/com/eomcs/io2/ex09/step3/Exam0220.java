package io2.ex09.step3;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import io2.ex09.BufferedInputStream;

public class Exam0220 {
	public static void main(String[] args) throws Exception {
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("temp/jls11.pdf"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("temp/jls11_5.pdf"));
		
		int b;
		
		long startTime = System.currentTimeMillis();
		
		while ((b = in.read()) != -1) 
			out.write(b);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
		in.close();
		out.close();
	}
}
