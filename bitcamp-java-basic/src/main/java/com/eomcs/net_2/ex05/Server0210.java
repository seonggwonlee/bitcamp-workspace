package com.eomcs.net_2.ex05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Server0210 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("서버 생성");
		
		System.out.println("소켓 생성 전 대기");
		scan.nextLine();
		
		DatagramSocket ds = new DatagramSocket(8888);
		
		byte[] buf = new byte[8196];
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		System.out.println("데이터 읽기 전 잠깐 대기");
		scan.nextLine();
		
		ds.receive(dp);
		System.out.println("데이터를 받았음");
		
		ds.close();
		scan.close();
		
		String message = new String(
				dp.getData(),
				0,
				dp.getLength(),
				"UTF-8");
		System.out.println(message);
	}
}
