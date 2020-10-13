package com.eomcs.net_2.ex03;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0150 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in); 
			ServerSocket ss = new ServerSocket(8888)) {
			
			System.out.println("클라이언트와 연결 대기중 ...");
			
			try (Socket socket = ss.accept();
				Scanner in = new Scanner(socket.getInputStream());
				PrintStream out = new PrintStream(socket.getOutputStream())) {
				
				System.out.println("클라이언트가 보낸 한 줄의 문자열을 기다리는 중...");
				
				String str = in.nextLine();
				System.out.println(str);
				
				System.out.println("> ");
				keyboard.nextLine();
				
				out.println(str);
				//out.flush();
				
				System.out.println("클라이언트에게 데이터 재송신");
			}
			System.out.println("클라이언트와 연결 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
}
