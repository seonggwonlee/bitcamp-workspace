package com.eomcs.net_2.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0130 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(8888)) {
		
			System.out.println("서버 실행");
			System.out.println("클라이언트의 연결을 기다리는 중...");

			try (Socket socket = ss.accept();
					DataOutputStream out = new DataOutputStream(socket.getOutputStream());
					DataInputStream in = new DataInputStream(socket.getInputStream())) {
				
				System.out.println("클라이언트와 입출력 준비 완료.");
				System.out.println("클라이언트가 보낸 int값을 기다리고 있음.");
				
				int value = in.readInt();
				System.out.println(value);
				
				System.out.println("데이터 송신 전 일시정지");
				keyboard.nextLine();
				
				out.writeInt(value);
				System.out.println("클라이언트에게 데이터 재송신");
			}
			System.out.println("클라이언트와 연결 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
}
