package io2.ex04;

import java.io.FileInputStream;

public class Exam0420 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/test3.data");
		
		byte[] buf = new byte[100];
		
		int count = in.read(buf);
		
		// Exam0410의 실행 결과로 만들어진 파일을 읽는다.
		// 바이트 배열에 들어있는 값을 사용하여 스트링 인스턴스를 만든다. 
		String str = new String(buf, 0, count);
		// new String(buf, 0, count)
		// => buf : 생성한 배열
		// => 0 : 0번째 부터 시작
		// => count : 배열의 크기만큼 설정했으므로 해당 크기만큼의 바이트를 꺼낸다.
		
		in.close();
		
		System.out.printf("%s\n", str);
	}
}
