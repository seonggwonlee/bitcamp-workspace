package com.eomcs.net_2.ex03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0110 {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = null;
		ServerSocket ss = null;
		
		try {
			keyboard = new Scanner(System.in);
			ss = new ServerSocket(8888);
			System.out.println("클라이언트의 연결을 기다리는 중..");
			
			Socket socket = null;
			OutputStream out = null;
			InputStream in = null;
			
			try {
				socket = ss.accept();
				System.out.println("대기열에 있는 클라이언트의 정보를 꺼내 소켓 생성");
				
				out = socket.getOutputStream();
				
				in = socket.getInputStream();
				System.out.println("클라이언트와 통신할 입출력 스트림 준비 완료");
				
				System.out.println("클라이언트가 보낸 데이터를 기다리는 중..");
				int request = in.read();
				
				System.out.println(request);
				
				System.out.println("데이터 송신 전 일시정지");
				keyboard.nextLine();
				
				out.write(request);
				
				System.out.println("클라이언트에게 데이터를 보냄");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {out.close();} catch (Exception e) {}
				try {in.close();} catch (Exception e) {}
				try {socket.close();} catch (Exception e) {}
				System.out.println("클라이언트와의 연결을 끊었음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {keyboard.close();} catch (Exception e) {}
			try {ss.close();} catch (Exception e) {}
		}
		System.out.println("서버 종료");
	}
}
