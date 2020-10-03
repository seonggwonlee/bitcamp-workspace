package io2.ex04;

import java.io.FileOutputStream;

public class Exam0210 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("temp/test3.data");
		
		int money = 1_3456_7890; // 0x080557D2
		
		// int 메모리의 모든 바이트를 한꺼번에 출력하려면
		// 각 바이트를 맨 끝으로 이동후 write()로 출력한다.
		// write()는 맨 끝 1바이트만 출력하기 때문이다.
		out.write(money >> 24);
		out.write(money >> 16);
		out.write(money >> 8);
		out.write(money);
		
		out.close();
		
		System.out.println("데이터 출력 완료");
	}
}
