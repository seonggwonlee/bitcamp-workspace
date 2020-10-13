package io2.ex05;

public class Exam0210 {

	public static void main(String[] args) throws Exception {
		DataFileOutputStream out = new DataFileOutputStream("temp/test4.data");
		
		Member member = new Member();
		member.name = "AB가각간";
		member.age = 27;
		member.gender = true;
		
		out.writeUTF(member.name);
		out.writeInt(member.age);
		out.writeBoolean(member.gender);
		
		System.out.println("데이터 출력 완료");
	}
}
