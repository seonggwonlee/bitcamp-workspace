package com.eomcs.basic2.ex04;

public class Exam0530 {
	public static void main(String[] args) {
		int a1, a2, a3, a4, a5;
		
		a1 = 100;
		a2 = 200;
		a3 = 300;
		a4 = 400;
		a5 = 500;
		
		int sum = a1 + a2 + a3 + a4 + a5;
		
		System.out.println(sum); 
		// 배열을 사용하지 않을 때
		
		int[] arr = new int[5];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		int sum2 = 0;
		
		for (int item : arr) {
			sum2 = sum2 + item;
		}
		System.out.println(sum2);
	}
	// 배열을 사용했을 때
}
