package com.eomcs.net_2.ex06;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class HttpClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("dpg.danawa.com", 80);
		PrintStream out = new PrintStream(socket.getOutputStream());
		Scanner in = new Scanner(socket.getInputStream());
		
		out.print("GET /bbs/view?boardSeq=230&listSeq=4431070 HTTP/1.1\r\n");
		out.print("Host: dpg.danawa.com\r\n");
		out.print("\r\n");
		
		while (true) {
			try {
				System.out.println(in.nextLine());
			} catch (Exception e) {
				break;
			}
		}
		out.close();
		in.close();
		socket.close();
	}
}
// http://www.danawa.com/