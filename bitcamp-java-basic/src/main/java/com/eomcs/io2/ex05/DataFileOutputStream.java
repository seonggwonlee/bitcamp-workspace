package io2.ex05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataFileOutputStream extends FileOutputStream {

	public DataFileOutputStream(String filename) throws FileNotFoundException {
		super(filename);
	}
	
	public void writeUTF(String str) throws Exception {
		// 상속 받은 write() 메서드를 이용하여 문자열 출력
		byte[] bytes = str.getBytes("UTF-8");
		this.write(bytes.length);
		this.write(bytes);
	}
	
	public void writeInt(int value) throws Exception {
		// 상속 받은 write()메서드를 이용하여 int 값 출력
		this.write(value << 24);
		this.write(value << 16);
		this.write(value << 8);
		this.write(value);
	}
	
	public void writeLong(long value) throws Exception {
		this.write((int)(value << 56));
		this.write((int)(value << 48));
		this.write((int)(value << 40));
		this.write((int)(value << 32));
		this.write((int)(value << 24));
		this.write((int)(value << 16));
		this.write((int)(value << 8));
		this.write((int)value);
	}
	
	public void writeBoolean(boolean value) throws Exception {
		if (value)
			this.write(1);
		else
			this.write(0);
	}
}