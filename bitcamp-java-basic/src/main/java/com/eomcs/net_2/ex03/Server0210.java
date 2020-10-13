package com.eomcs.net_2.ex03;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0210 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in); 
			ServerSocket ss = new ServerSocket(8888)) {
			
			System.out.println("클라이언트와 연결 대기중..");
			
			try (Socket socket = ss.accept();
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter out = new PrintWriter(socket.getOutputStream())) {
				
			System.out.println("클라이언트가 보낸 문자열 수신 대기 중");
			
			String str = in.readLine();
			System.out.println(str);
			
			System.out.println(">");
			keyboard.nextLine();
			
			out.println(str);
			
			System.out.println("클라이언트에게 데이터 보냄");
			
			}
			System.out.println("클라이언트와 연결 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
}
