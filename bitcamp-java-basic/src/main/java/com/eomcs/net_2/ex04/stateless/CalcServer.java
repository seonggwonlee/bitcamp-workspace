package com.eomcs.net_2.ex04.stateless;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class CalcServer {
	
	static Map<Long, Integer> resultMap = new HashMap<>();
	
	public static void main(String[] args) throws Exception {
		// 각 클라이언트 작업 결과를 보관할 맵 객체
		System.out.println("서버 실행 중");
		
		ServerSocket ss = new ServerSocket(8888);
		
		while (true) {
			Socket socket = ss.accept();
			System.out.println("클라이언트 요청 처리");
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
			DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
			
			long clientId = in.readLong();
			
			String op = in.readUTF();
			int value = in.readInt();
			
			Integer obj = resultMap.get(clientId);
			int result = 0;
				
			if (obj != null) {
				System.out.printf("%d 기존 고객 요청 처리\n", clientId);
				result = obj;
			} else {
				clientId = System.currentTimeMillis();
				System.out.printf("%d 신규 고객 요청 처리\n", clientId);
			}
				switch (op) {
				case "+" :
					result += value;
					break;
				case "-" :
					result -= value;
					break;
				case "*" :
					result *= value;
					break;
				case "/" :
					result /= value;
					break;
				case "quit" :
					break ;
				}
				out.writeLong(clientId);
				out.writeInt(result);
				out.flush();
				
				resultMap.put(clientId, result);
		}
	}
}
