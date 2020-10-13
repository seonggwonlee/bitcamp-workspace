package com.eomcs.net_2.ex05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client0210 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		
		String receiver = "localhost";
		int port = 8888;
		
		byte[] bytes = "Hello".getBytes("UTF-8");
		
		DatagramPacket packet = new DatagramPacket(
				bytes,
				bytes.length,
				InetAddress.getByName(receiver),
				port);
		
		ds.send(packet);
		System.out.println("데이터 전송 완료");
		
		ds.close();
 	}
}
