package io2.ex09;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exam0110 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/test4.data");
		// 파일 저장소에서 데이터를 읽는 역할
		
		BufferedInputStream in2 = new BufferedInputStream(in);
		// 버퍼를 이용하여 일정량의 데이터를 한 번에 읽어온 다음 바이트를 꺼낸다.
		// FileInputStream + BufferedInputStream이 된다.
		
		DataInputStream in3 = new DataInputStream(in2);
		// 문자열이나 자바 기본 타입의 데이터를 좀 더 쉽게 읽을 수 있게 한다.
		// 그러나 클래스 특성상 이런 식으로 기능 확장은 할 수 없다.
		// DataInputStream 생성자에는 InputStream객체만 넘겨줄 수 있다.
		// FileInputStream + BufferedInputStream + DataInputStream
		// BufferedInputStream은 InputStream의 자식이 아니기 때문에 넘겨줄 수 없다.
		
		Member member = new Member();
		member.name = in3.readUTF();
		member.age = in3.readInt();
		member.gender = in3.readBoolean(); 
		
		in3.close();
		in2.close();
		in.close();
		
		System.out.println(member);
	}
}
