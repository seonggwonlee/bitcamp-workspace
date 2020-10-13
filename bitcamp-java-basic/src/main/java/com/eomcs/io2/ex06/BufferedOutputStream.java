package io2.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {

	byte[] buf = new byte[8192];
	int cursor;
	
	public BufferedOutputStream(String filename) throws Exception {
		super(filename);
	}
	
	@Override
	public void write(int b) throws IOException {
		if (cursor == buf.length) { // 버퍼가 다 차면
			super.write(buf); // 버퍼에 있는 데이터를 한 번에 출력
			cursor = 0; // 다시 커서 초기화
		}
	buf[cursor++] = (byte) b;
}

		@Override
		public void write(byte[] buf) throws IOException {
			for (byte b : buf) {
				this.write(b & 0x000000ff);
			}
		}
		
		@Override
		public void close() throws IOException {
			this.flush();
			super.close();
		}
		
		@Override
		public void flush() throws IOException {
			if(cursor > 0) {
				this.write(buf, 0, cursor);
				cursor = 0;
			}
		}
}
