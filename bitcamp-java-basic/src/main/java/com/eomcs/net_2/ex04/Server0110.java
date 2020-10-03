package com.eomcs.net_2.ex04;
// 통신방식 - stateful
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0110 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in); 
		ServerSocket ss = new ServerSocket(8888)) {
			System.out.println("서버 실행");
			
			try (Socket socket = ss.accept(); 
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream())) {
				
				System.out.println("클라이언트와 송수신 대기중");
				
				while (true) {
					String name = in.readLine();
					if (name.equalsIgnoreCase("quit")) {
						out.println("Goodbye");
						out.flush();
						break;
					}
					out.printf("%s님 환영합니다.", name);
					out.flush();
				}
			}
			System.out.println("클라이언트와 연결 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
}
