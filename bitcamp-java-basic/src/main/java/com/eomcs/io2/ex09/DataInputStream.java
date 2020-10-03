package io2.ex09;

import java.io.IOException;
import java.io.InputStream;

public class DataInputStream extends InputStream {
	InputStream 연결부품;
	
	public DataInputStream(InputStream in) {
		연결부품 = in;
	}
	
	@Override
	public int read() throws IOException {
		return 연결부품.read();
	}
	
	public String readUTF() throws Exception {
		int size = 연결부품.read();
		byte[] bytes = new byte[size];
		연결부품.read(bytes);
		return new String(bytes, "UTF-8");
	}
	
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
