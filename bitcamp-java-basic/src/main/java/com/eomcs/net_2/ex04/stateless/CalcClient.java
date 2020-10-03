package com.eomcs.net_2.ex04.stateless;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
	public static void main(String[] args) throws Exception {
		Scanner keyScan = new Scanner(System.in);
		
		long clientId = 0;
		
		while (true) {
			
			System.out.print("연산자 : ");
			String op = keyScan.nextLine();
			
			System.out.print("값 : ");
			int value = Integer.parseInt(keyScan.nextLine());
			
				try (Socket socket = new Socket("localhost", 8888);
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
					
				out.writeLong(clientId);
				
				out.writeUTF(op);
				out.writeInt(value);
				out.flush();
				
				clientId = in.readLong();

				int result = in.readInt();
				System.out.printf("계산 결과 : %d\n", result);
			
		} catch (Exception e) {
			System.out.println("통신 오류 발생");
		} 
			System.out.print("계속 진행하시겠습니까? (y/N) ");
			if (keyScan.nextLine().equalsIgnoreCase("n")) {
				break;
			}
		}
	keyScan.close();
	}
}
