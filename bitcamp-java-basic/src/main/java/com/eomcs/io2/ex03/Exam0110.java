package io2.ex03;

import java.io.FileWriter;

// character stream - 문자 단위로 출력
public class Exam0110  {
	
	public static void main(String[] args) throws Exception {
		FileWriter out = new FileWriter("temp/test2.txt");
		
		System.out.printf("file.encoding = %s\n", System.getProperty("file.encoding"));
		
		out.write(0x7a6bac00);
		out.write(0x7a5f0041);
		
		out.close();
		
		System.out.println("출력완료");
	}
	
	// JVM이 문자열을 파일로 출력할 때
	// FileOutputStream과 같은 바이트 스트림 클래스를 사용하면
	// 문자집합을 지정해야 하는 번거로움이 존재한다. 
	// 문자 스트림 클래스를 사용한다면 번거로움이 사라진다. 
	
	// JAVA는 문자 데이터를 다룰 때 UCS2 유니코드를 사용한다.
	// 그래서 출력 시 JVM에 설정된 문자집합을 UCS2 문자집합으로 변환한다.
	// 여기서 만약 JVM 실행할 때 출력 문자 데이터의 문자집합을 따로 지정해주지 않는다면
	// JVM은 OS의 기본 문자집합을 참고하여 그에 맞게 변환하게 된다. Windows(MS949), Unix(UTF-8)
	// 문자집합 지정 방법
	// -Dfile.encoding=문자코드표
	
	// 이클립스 에디터를 통해 컴파일 한다면
	// 이클립스는 자체적으로 -Dfile.encoding=UTF-8로 설정하기 때문에 
	// UCS2를 UTF-8로 자동 변환하여 파일에 쓴다.
	
	// 콘솔창으로 실행한다면
	// file.encoding으로 환경변수 지정 유무에 따라 OS기본 문자 코드로 변환유무가 결정된다.
	// 환경변수를 지정하지 않는다면 OS의 기본 문자 코드로, 지정한다면 지정한 문자 코드로 변환된다.
	
	
}
