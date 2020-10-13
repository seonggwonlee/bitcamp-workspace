package com.eomcs.net_2.ex02;

import java.net.ServerSocket;
import java.util.Scanner;

public class Server0310 {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("서버 실행");
		
		ServerSocket ss = new ServerSocket(8888, 2);
		System.out.println("서버 소켓 생성 완료");
		System.out.println("클라이언트를 기다리는 중입니다...");
		
		keyboard.nextLine();
		
		ss.close();
		System.out.println("서버를 종료합니다.");
		keyboard.close();
		
	}
}
