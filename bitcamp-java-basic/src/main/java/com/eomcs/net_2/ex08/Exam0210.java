package com.eomcs.net_2.ex08;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Exam0210 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.daum.net");
		
		URLConnection con = url.openConnection();
		// URL 정보를 가지고 HTTP 요청을 수행할 객체를 얻는다.
		
		con.connect();
		// 웹서버와 연결 후 HTTP 요청
		
		System.out.printf("Content-Type: %s\n", con.getContentType());
		System.out.printf("Content-Length: %d\n", con.getContentLength());
		System.out.printf("Content-Encoding: %s\n", con.getContentEncoding());
		// URL.openStream()을 사용하는 것보다 이점
		// 응답 헤더에서 다양한 값을 추출할 수 있다.
		
		System.out.printf("Content-Type: %s\n", con.getHeaderField("Content-Type"));
		System.out.printf("Server: %s\n", con.getHeaderField("Server"));
		System.out.println();
		
		InputStream in = con.getInputStream();
		
		BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
		
		while (true) {
			String str = in2.readLine();
			if (str == null)
				break;
			
			System.out.println(str);
		}
		
		in2.close();
		in.close();
	}
}
