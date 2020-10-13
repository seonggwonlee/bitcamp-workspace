package com.eomcs.net_2.ex02;

import java.net.Socket;
import java.util.Scanner;

public class Client0210 {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("클라이언트 실행");
		
		Socket socket = new Socket("localhost", 8888);
		System.out.println("서버 접속 완료");
		
		keyboard.nextLine();
		
		socket.close();
		System.out.println("서버와의 연결 해제");
		
		keyboard.close();
	}
}
