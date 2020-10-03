package com.eomcs.net_2.ex04.stateful;

// stateful방식의 이점 활용
import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {
	public static void main(String[] args) throws Exception {
		System.out.println("서버 실행 중");
		
		ServerSocket ss = new ServerSocket(8888);
		
		while (true) {
			Socket socket = ss.accept();
			try {
				processRequest(socket);
			} catch (Exception e) {
				System.out.println("클라이언트 요청 처리 중 오류 발생");
				System.out.println("다음 클라이언트의 요청 대기 중");
				}
			}
		}

	static void processRequest(Socket socket) throws Exception {
		try (Socket socket2 = socket;
			DataInputStream in = new DataInputStream(socket.getInputStream());
			PrintStream out = new PrintStream(socket.getOutputStream())) {
			
			int result = 0;
			
			loop : while (true) {
				String op = in.readUTF();
				int a = in.readInt();
				
				switch (op) {
				case "+" :
					result += a;
					break;
				case "-" :
					result -= a;
					break;
				case "*" :
					result *= a;
					break;
				case "/" :
					result /= a;
					break;
				case "quit" :
					break loop;
				}
				out.printf("결과 = %d\n", result);
			}
		out.println("quit");
		}
	}
}
