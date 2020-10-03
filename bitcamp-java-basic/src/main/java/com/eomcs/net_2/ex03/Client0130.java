package com.eomcs.net_2.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0130 {
	public static void main(String[] args) {
	    try (Scanner keyScan = new Scanner(System.in);
	    		Socket socket = new Socket("localhost", 8888);
	    		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
	    		DataInputStream in = new DataInputStream(socket.getInputStream())) {
	      System.out.println("서버와 연결되었음!");

	      System.out.println("소켓을 통해 입출력 스트림을 준비하였음!");

	      // 서버에 데이터를 보내기 전에 잠깐 멈춤!
	      System.out.print(">");
	      keyScan.nextLine();

	      // 서버에게 데이터 보내기
	      // - 보통 클라이언트 쪽에서 먼저 서버로 데이터를 보낸다.
	      // - 실제 write()는 소켓의 내부 버퍼로 출력한다.
	      // 따라서 write() 호출 후 즉시 리턴될 것이다.
	      out.writeInt(1251234567);
	      // out.flush();
	      // byte stream 을 사용할 때는 바로 출력한다.
	      // 따라서 flush()를 호출하지 않아도 된다.
	      System.out.println("서버에 데이터를 보냈음!");

	      int value = in.readInt();
	      System.out.println(value);
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    } 	
	}
}
