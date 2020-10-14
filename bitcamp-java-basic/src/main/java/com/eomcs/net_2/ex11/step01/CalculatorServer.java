package com.eomcs.net_2.ex11.step01;

import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String[] args) {
		
		try (ServerSocket ss = new ServerSocket(8888)) {
			System.out.println("서버 실행");

			
			while (true) {
				RequestProcessor thread = new RequestProcessor(ss.accept());
				thread.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}