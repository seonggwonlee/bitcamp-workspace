package com.eomcs.net_2.ex02;

import java.net.Socket;
import java.util.Scanner;

public class Client0211 {
	  public static void main(String[] args) throws Exception {
	    // 실행을 잠시 중단시키기 위해 사용
	    Scanner keyScan = new Scanner(System.in);
	    System.out.println("클라이언트 실행!");
	    
	    int count = 0;
	    while (true) {
	    	try {
	    		Socket socket = new Socket("localhost", 8888);
	    		System.out.printf("서버에 연결됨! - %d\n", ++count);
	    		keyScan.nextLine();
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		break;
	    	}
	    }
	    System.out.println("서버와의 연결을 끊었음.");

	    keyScan.close();
	  }
	}
