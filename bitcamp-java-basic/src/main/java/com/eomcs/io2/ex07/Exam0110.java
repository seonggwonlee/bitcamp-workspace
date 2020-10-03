package io2.ex07;

import java.io.ByteArrayInputStream;

public class Exam0110 {
	public static void main(String[] args) throws Exception {
		byte[] buf = {0x0b, 0x41, 0x42, (byte) 0xea, (byte) 0xb0, (byte) 0x80, (byte) 0xea, (byte) 0xb0,
		        (byte) 0x81, (byte) 0xea, (byte) 0xb0, (byte) 0x84, 0x00, 0x00, 0x00, 0x1b, 0x01};
		
		ByteArrayInputStream in = new ByteArrayInputStream(buf);
		// 바이트 배열에서 데이터를 읽는 도구
		
		int b;
		
		while (true) {
			b = in.read();
			if (b == -1)
				break;
			System.out.printf("%x ", b);
		}
		System.out.println();
		
		in.close();
	}
	// 보통 바이트 배열에서 데이터를 읽을 때 인덱스를 가지고 직접 바이트 배열의 값을 읽는다.
	// ex) int b = buf[2];
	// 그런데 바이트 배열도 데이터 저장소로 간주하고 read()로 바로 호출할 수 있다.
	// 이렇게 하면 일관된 방법으로 코딩하기 때문에 유지보수가 편하게 되고
	// 결국 데이터가 어디에 저장되어 있든 상관없이 read() 메서드를 사용한다면 데이터를 읽을 수 있게 된다.
}
