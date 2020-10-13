package com.eomcs.net_2.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0210 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in);
			Socket socket = new Socket("localhost", 8888);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
				
			System.out.println("서버와 연결됨.");
			
			System.out.println("> ");
			keyboard.nextLine();
			
			out.println("ABC가각간");
			
			System.out.println("서버에 데이터 송신 완료");
			
			String str = in.readLine();
			System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
