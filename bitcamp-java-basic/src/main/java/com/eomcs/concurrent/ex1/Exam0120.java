package com.eomcs.concurrent.ex1;

public class Exam0120 {

	public static void main(String[] args) {
		
		new MyThread().start();
		
		Thread name = Thread.currentThread();
		System.out.println(name.getName());
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("->" + i);
		}
		
	}
	static class MyThread extends Thread {
		@Override
		public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("=>" + i);
			}
		}
	}
}
