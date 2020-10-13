package com.eomcs.net_2.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0210 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(8888)) {
			
			System.out.println("서버 생성");
			
			while (true) {
			try (Socket socket = ss.accept();
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream())) {
				
				System.out.println("스트림 준비 완료");
				
				String name = in.readLine();
				out.printf("%s님 환영합니다.", name);
				out.flush();
			} catch (Exception e) {
				System.out.println("클라이언트와 통신 중 오류 발생");
				}
			System.out.println("클라이언트와 연결 해제");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
}
