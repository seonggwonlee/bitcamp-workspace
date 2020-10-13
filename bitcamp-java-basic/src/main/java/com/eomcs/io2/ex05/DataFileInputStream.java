package io2.ex05;

import java.io.FileInputStream;

public class DataFileInputStream extends FileInputStream {
		public DataFileInputStream(String filename) throws Exception {
			super(filename);
		}
		
		public String readUTF() throws Exception {
			// 상속받은 read() 메서드를 이용하여 문자열 출력
			int size = this.read();
			byte[] bytes = new byte[size];
			this.read(bytes); // 이름 배열 개수만큼 바이트를 읽어 배열에 저장한다.
			return new String(bytes, "UTF-8");
		}
		
		public int readInt() throws Exception {
			// 상속 받은 read() 메서드를 이용하여 int값 출력
			int value = 0;
			
		    value = this.read() << 24;
		    value += this.read() << 16;
		    value += this.read() << 8;
		    value += this.read();
		    
		    return value;
	}
		
		public long readLong() throws Exception {
			// 상속 받은 read() 메서드를 이용하여 long값 출력
			long value = 0;
			
			value += (long) this.read() << 56;
			value += (long) this.read() << 48;
			value += (long) this.read() << 40;
			value += (long) this.read() << 32;
			value += (long) this.read() << 24;
			value += (long) this.read() << 16;
			value += (long) this.read() << 8;
			value += (long) this.read();
			
			return value;
		}
		
		public boolean readBoolean() throws Exception {
			// 상속 받은 read() 메서드를 이용하여 boolean값 출력
			if (this.read() == 1)
				return true;
			else
				return false;
		}
}
