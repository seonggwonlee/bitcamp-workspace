package io2.ex09.step3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exam0110 {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fileOut = new FileOutputStream("temp/test6.data");
		
		DataOutputStream out = new DataOutputStream(fileOut);
		
		Member member = new Member();
		member.name = "ABC가각간";
		member.age = 27;
		member.gender = true;
		
		out.writeUTF(member.name);
		out.writeInt(member.age);
		out.writeBoolean(member.gender);
		
		out.close();
		
		System.out.println("데이터 출력 완료");
	}
}
