package com.eomcs.net_2.ex11.step01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class RequestProcessor extends Thread {
	Socket socket;
	
	public RequestProcessor (Socket socket) {
		this.socket = socket;
	}
	
	@Override
		public void run() {
			
			try (Socket socket = this.socket; 
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));				 
				PrintStream out = new PrintStream(socket.getOutputStream())) {
	
					sendResponse(out, compute(in.readLine()));
			} catch (Exception e) {
				System.out.printf("클라이언트 요청 처리 중 오류 발생 - %s\n", e.getMessage());
			}
		} 
	private void printResponse (PrintStream out) throws Exception {
		out.println("계산기 서버에 오신 것을 환영합니다.");
		out.println("계산 식을 입력해주세요");
		out.println("예) 23 + 7 ");
		out.println();
		out.flush();
	}
	
	private void sendResponse (PrintStream out, String message) {
		out.println(message);
		out.println();
		out.flush();
	} // 리팩토링
	
	private String compute (String request) {
		try {
		String[] input = request.split(" ");
		
		int a = Integer.parseInt(input[0]);
		String op = input[1];
		int b = Integer.parseInt(input[2]);
		int result = 0;
		
		switch (op) {
		case "+" : result = a + b; Thread.sleep(5000); break; 
		case "-" : result = a - b; break;
		case "*" : result = a * b; break;
		case "/" : result = a / b; break;
		default : 
			return String.format("올바른 연산값이 아닙니다.", op);
		}
		return String.format("결과는 %d %s %d = %d입니다.", a, op, b, result);
		
		} catch (Exception e) {
			return String.format("계산식 실행 중 오류 발생 - %s", e.getMessage());
		}
	}
	}
