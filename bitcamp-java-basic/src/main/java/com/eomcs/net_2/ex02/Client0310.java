package com.eomcs.net_2.ex02;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client0310 {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("클라이언트 실행");
		
		Socket socket = new Socket();
		System.out.println("소켓 생성");
		
		SocketAddress sa = new InetSocketAddress("localhost", 8888);
		
		System.out.println("서버와 연결 시도..");
		socket.connect(sa, 10000); // timeout, 밀리세컨드로 취급함.
		System.out.println("서버와 연결 성공");
		
		keyboard.nextLine();
		
		socket.close();
		System.out.println("서버와 연결을 해제합니다.");
		
		keyboard.close();
	}
}
