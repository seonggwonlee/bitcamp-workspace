package com.eomcs.net_2.ex02;

import java.net.ServerSocket;
import java.util.Scanner;

public class Server0210 {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("서버 실행");
		
		ServerSocket socket = new ServerSocket(8888);
		System.out.println("서버 소켓 생성 완료");
		System.out.println("클라이언트를 기다리는 중");
		
		keyboard.nextLine();
		socket.close();
		System.out.println("서버 종료");
		keyboard.close();
	}
}
