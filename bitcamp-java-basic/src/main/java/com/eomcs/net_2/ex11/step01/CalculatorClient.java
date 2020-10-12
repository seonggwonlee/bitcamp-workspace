package com.eomcs.net_2.ex11.step01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		
		while (true) {
			
		      // 요청 때 마다 연결하기 때문에 서버의 인사말은 더이상 출력하지 않는다.
		      String input = prompt(keyboardScanner);
		      if (input == null) {
		        continue;
		      } else if (input.equalsIgnoreCase("quit")) {
		        // quit 명령을 입력할 경우 서버에 접속할 필요가 없이 즉시 클라이언트를 종료한다.
		        break;
		      }

		      try (Socket socket = new Socket("localhost", 8888);
		          PrintStream out = new PrintStream(socket.getOutputStream());
		          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

		        sendRequest(out, input); // 서버에 요청을 보내기
		        receiveResponse(in); // 서버의 실행 결과를 받기

		      } catch (Exception e) {
		        e.printStackTrace();
		      }
		    }

			keyboardScanner.close();
		  }
	
	static void receiveResponse (BufferedReader in) throws Exception {
		while (true) {
			String input = in.readLine();
			if (input.length() == 0) {
				break;
			}
			System.out.println(input);
		}
	}
	
	static void sendRequest(PrintStream out, String message) throws Exception {
		out.println(message);
		out.flush();
	}
	
	static String prompt(Scanner scan) {
		System.out.print("계산식 > ");
		String input = scan.nextLine();
		
		if (input.equalsIgnoreCase("quit")) {
			return input;
			
		} else if (input.split(" ").length != 3) {
			System.out.println("입력한 형식이 올바르지 않습니다. 예) 23 + 7");
			return null;
		}
		return input;
	}
}
