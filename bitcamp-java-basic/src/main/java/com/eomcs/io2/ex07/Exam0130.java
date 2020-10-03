package io2.ex07;

// 메모리에서 데이터를 읽기 - 바이트 배열에서 String, int, boolean 값 읽기

public class Exam0130 {
	public static void main(String[] args) throws Exception {
		byte[] buf = {0x0b, 0x41, 0x42, (byte) 0xea, (byte) 0xb0, (byte) 0x80, (byte) 0xea, (byte) 0xb0,
		        (byte) 0x81, (byte) 0xea, (byte) 0xb0, (byte) 0x84, 0x00, 0x00, 0x00, 0x1b, 0x01}; 
		
		DataByteArrayInputStream in = new DataByteArrayInputStream(buf);
		
		Member member = new Member();
		
		member.name = in.readUTF();
		member.age = in.readInt();
		member.gender = in.readBoolean();
		
		in.close();
		
		System.out.println(member);
	}
	
	// 문제
	// => DataByteArrayInputStream과 DataFileInpuStream 클래스는
	// 생성자를 제외하고 모든 코드가 같다.
	// => 코드는 같으나 재사용할 수가 없다. 이것이 상속으로 기능을 확장했을 때의 한계이다.
	// 따라서 상속이 아닌 포함 관계로 변경하면 필요에 따라 장착유무를 정할 수 있다.
	// 이것이 바로 장신구(Decorator)이다. 
}
