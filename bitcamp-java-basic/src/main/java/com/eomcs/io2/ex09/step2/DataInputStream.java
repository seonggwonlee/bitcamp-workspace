package io2.ex09.step2;

import java.io.InputStream;

public class DataInputStream extends DecoratorInputStream {
	
	public DataInputStream(InputStream in) {
		super(in);
	}
	
	
	public String readUTF() throws Exception {
		int size = 연결부품.read();
		byte[] bytes = new byte[size];
		연결부품.read(bytes);
		return new String(bytes, "UTF-8");
	}
	// 이 객체는 데이터를 읽는 일을 하지 않는다.
	// 다만 연결된 부품을 사용하여 데이터를 읽어 중간에서 String 객체로 가공한다.
	// 이런 객체가 Decorator이고, 이런 객체를 자바에서는 Data Processing Stream Class라고 부른다.
	
	public int readInt() throws Exception {
		int value = 0;
		
		value = 연결부품.read() << 24;
		value = 연결부품.read() << 16;
		value = 연결부품.read() << 8;
		value = 연결부품.read();
		
		return value;
	}
	
	public long readLong() throws Exception {
		
		long value = 0;
		
		value += (long) (연결부품.read()) << 56;
		value += (long) (연결부품.read()) << 48;
		value += (long) (연결부품.read()) << 40;
		value += (long) (연결부품.read()) << 32;
		value += (long) (연결부품.read()) << 24;
		value += (long) (연결부품.read()) << 16;
		value += (long) (연결부품.read()) << 8;
		value += (long) (연결부품.read());
		
		return value;
	}
	
	public boolean readBoolean() throws Exception {
		if (연결부품.read() == 1)
			return true;
		else
			return false;
	}
}
