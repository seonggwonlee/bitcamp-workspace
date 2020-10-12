package com.eomcs.concurrent.ex3;

public class Exam0110 {
	public static void main(String[] args) {
		
		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("==>" + i);
				}
			}
		}
		
		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(">>>" + i);
		}
	}
}
