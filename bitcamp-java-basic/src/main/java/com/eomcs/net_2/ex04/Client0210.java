package com.eomcs.net_2.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0210 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			System.out.print("이름 : ");
			String name = keyboard.nextLine();
			
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
		try (Socket socket = new Socket("localhost", 8888); 
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream())) {
			
			System.out.println("서버와 연결 성공");
			
			out.println(name);
			out.flush();
			
			String str = in.readLine();
			System.out.println(str);
			
			System.out.println("서버와 연결 종료");
		} catch (Exception e) {
			e.printStackTrace();
			}
		}
		keyboard.close();
	}
}
