package com.eomcs.net_2.ex03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0120 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(8888)) {
		
			System.out.println("서버 실행");
			System.out.println("클라이언트의 연결을 기다리는 중...");

			try (Socket socket = ss.accept();
					OutputStream out = socket.getOutputStream();
					InputStream in = socket.getInputStream()) {
				
				System.out.println("대기열의 클라이언트 정보를 통해 소켓 생성");
				System.out.println("클라이언트와 입출력 준비 완료.");
				
				System.out.println("클라이언트가 보낸 100바이트를 기다리고 있음.");
				byte[] buf = new byte[100];
				int size = in.read(buf);
				System.out.printf("읽은 바이트 수 : %d\n", size);
				
				for (int i = 0; i < size; i++) {
					if (i > 0 && (i % 20) == 0) {
						System.out.println();
					}
					System.out.printf("%x ", buf[i]);
				}
				
				System.out.println("데이터 송신 전 일시정지");
				keyboard.nextLine();
				
				out.write(buf, 0, size);
				System.out.println("클라이언트에게 데이터 송신");
			}
			System.out.println("클라이언트와 연결 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
}
