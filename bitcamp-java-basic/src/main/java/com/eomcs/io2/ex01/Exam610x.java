package io2.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam610x {

	public static void main(String[] args) {
		// 1) 현재 폴더의 모든 파일 또는 디렉토리 이름을 출력
		// 2) 파일 이름과 디렉토리일 경우 d 파일일 경우 -를 앞에 출력
		// 3) 파일의 크기 출력
		// 4) 파일 크기 출력 시 출력결과를 10자리로 고정
		// 5) 파일 크기 출력할 때 크기가 0인 경우 빈 문자열 출력
		// 6) 파일 이름이 .java로 끝나는 경우만 출력
		// 7) 출력에서 디렉토리 제외
		// 8) 필터를 익명 클래스로 변경
		// 9) 익명 클래스를 파라미터로 넣는다.
		// 10) 익명 클래스를 람다로 변경
		File file = new File(".");
		File[] files = file.listFiles(f -> f.isFile() && f.getName().endsWith(".java"));
		// listfiles => 파일배열리턴
		for (File f : files) {
			System.out.printf("%s %10s %s\n", 
					f.isDirectory() ? "d" : "-",
					f.length() > 0 ? f.length() : "",
					f.getName());
		}
	}
}
