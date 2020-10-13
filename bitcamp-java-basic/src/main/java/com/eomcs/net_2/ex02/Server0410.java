package com.eomcs.net_2.ex02;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0410 {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		ServerSocket ss = new ServerSocket(8888, 2);
		System.out.println("서버 소켓 생성 완료");
		System.out.println("클라이언트를 기다리는 중...");
		
		System.out.println("대기열에 있는 클라이언트에 대한 승인 :");
		keyboard.nextLine();
		
		Socket socket = ss.accept();
		System.out.println("승인 완료");
		
		keyboard.nextLine();

		socket.close();
		System.out.println("클라이언트와 연결 해제");
		
		ss.close();
		System.out.println("서버 종료");
		
		keyboard.close();
	}
}
