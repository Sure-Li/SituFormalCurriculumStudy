package com.situ.lession13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamTest {

	public static void main(String[] args) {
		File file = new File("D:\\1.txt");
		File fileOutput = new File("E:\\2.txt");
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(file);
			output = new FileOutputStream(fileOutput);
			int b = -1;
			while ((b = input.read()) != -1) {
				System.out.print((char) b);
				output.write(b);
			}

		} catch (Exception e) {
			System.out.println("文件读取失败");
			e.printStackTrace();
		} finally {
			// 不管是否有异常 finally 一定会运行
			// 资源回收 后用完的先关闭
			try {
				output.close();
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
