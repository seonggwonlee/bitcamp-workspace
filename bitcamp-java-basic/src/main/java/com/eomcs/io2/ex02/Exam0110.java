package io2.ex02;

import java.io.FileOutputStream;

// 바이트 단위로 출력하기
public class Exam0110 {
	public static void main(String[] args) {
		FileOutputStream out = new FileOutputStream("temp/test1.data");
		// 1) 파일로 데이터를 출력하는 객체 준비
		// new FileOutputStream(해당파일경로)
		// 지정된 경로에 파일을 자동 생성, 만약 같은 이름의 파일이 있다면 덮어쓰기 (기존 파일은 삭제됨)
		// 파일 경로가 절대경로가 아니면 
		// 리눅스, 유닉스( /), 윈도우(c:\, d:\) 등으로 시작하지 않으면
		// 현재 디렉토리가 기준이 된다.
		
		out.write(0x7a6b5c4d);;
		// 2) 1바이트를 출력한다.
		// - int값을 아규먼트로 넘겨도 맨 마지막 1바이트만 출력한다.
		
		out.close();
		// 3) 출력도구를 닫는다.
		// OS에서 관리하는 자원 중 한정된 자원들은
		// 여러 프로그램이 공유할 때, 사용 후 OS에 반납해야만 다른 프로그램이 해당 자원을 사용할 수 있다.
		// 예) 파일, 메모리, 네트워크 연결 등
		// 임의로 close를 하지 않아도 JVM에서 자동으로 해주긴 하나,
		// 24시간 돌아가는 프로그램은 임의로 close를 해주지 않는다면 자원 부족 문제가 생길 수 있다.
		
		System.out.println("데이터 출력 완료");
	}
}
