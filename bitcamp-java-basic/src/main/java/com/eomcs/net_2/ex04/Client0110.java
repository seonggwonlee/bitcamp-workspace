package com.eomcs.net_2.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0110 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in); 
			Socket socket = new Socket("localhost", 8888);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream())) {
			
			System.out.println("서버와 연결 성공");
			
			String name = null;
			do {
				System.out.print("이름 : ");
				name = keyboard.nextLine();
				
				out.println(name);
				out.flush();
				
				String str = in.readLine();
				System.out.println(str);
			} while (!name.equalsIgnoreCase("quit"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
