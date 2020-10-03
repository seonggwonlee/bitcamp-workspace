package io2.ex09;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {
	InputStream 연결부품;
	
	byte[] buf = new byte[8192];
	int size;
	int cursor;
	
	public BufferedInputStream(InputStream in) {
		연결부품 = in;
	}
	
	@Override
	public int read() throws IOException {
		if (cursor == size) {
			if ((size = 연결부품.read(buf)) == -1) {
				return -1;
			}
			cursor = 0;
		}
		return buf[cursor++] & 0x000000ff;
	}
}
