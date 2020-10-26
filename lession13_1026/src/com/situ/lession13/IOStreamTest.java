package com.situ.lession13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamTest {

	public static void main(String[] args) {
		File file = new File("1.txt");
		try {
			OutputStream output = new FileOutputStream(file);
			byte[] a = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
			output.write(a);
			output.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			InputStream input = new FileInputStream(file);
			// 没必要用数组 限制了长度
//			byte[] b = new byte[5];
//			input.read(b);
//			for (byte c : b) {
//				System.out.print((char)c);
//			}
			int b = -1;
			while ((b = input.read()) != -1) {
				System.out.print((char) b);
			}
			input.close();

		} catch (Exception e) {
			System.out.println("文件读取失败");
			e.printStackTrace();
		}
	}

}
