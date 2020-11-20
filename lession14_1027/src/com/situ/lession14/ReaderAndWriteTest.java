package com.situ.lession14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class ReaderAndWriteTest {

	public static void main(String[] args) {
		InputStream in = null;
		try {
			in = new FileInputStream("1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new InputStreamReader(in, "gbk");
			writer = new OutputStreamWriter(new FileOutputStream("2.txt"), "UTF-8");
//			System.out.println(reader);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = -1;
		char[] bChar = new char[2048];
		try {
			while ((count = reader.read(bChar)) != -1) {
				writer.write(bChar);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static char[] getChars(byte[] bytes) {
		Charset cs = Charset.forName("UTF-8");
		ByteBuffer bb = ByteBuffer.allocate(bytes.length);
		bb.put(bytes);
		bb.flip();
		CharBuffer cb = cs.decode(bb);
		return cb.array();
	}

}
