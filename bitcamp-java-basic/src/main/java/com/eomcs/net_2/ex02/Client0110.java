package com.eomcs.net_2.ex02;

import java.net.Socket;

public class Client0110 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8888);
		
		System.out.println("서버에 연결되었음.");
		
		socket.close();
		
		System.out.println("서버와 연결 해제하였음.");
	}
}
// 상호간 통신을 위해서는 구분할 수 있게 포트번호를 부여해야한다.
// 서버측은 포트번호를 지정할 수 있지만
// 클라이언트 측은 new Socket() 실행시 포트 번호가 OS에 의해 임의 부여된다.
// 그래서 서버와 연결될 때마다 클라이언트 측의 포트 번호가 새로 부여된다.