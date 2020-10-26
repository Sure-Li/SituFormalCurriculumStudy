package com.situ.lession13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTesst {

	public static void main(String[] args) {
		long startTime1 = System.currentTimeMillis();
		InputStream input1 = null;
		try {
			input1 = new FileInputStream("src\\com\\situ\\lession13\\test\\Java基础核心总结.pdf");
			int b = -1;
			while ((b = input1.read()) != -1) {
//				System.out.print(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("程序1运行时间：" + (endTime1 - startTime1) + "ms"); // 输出程序运行时间
		long startTime2 = System.currentTimeMillis();
		InputStream input2 = null;
		try {
			input2 = new FileInputStream("src\\com\\situ\\lession13\\test\\Java基础核心总结.pdf");
			byte[] b = new byte[2048];
			int count = -1;
			while ((count = input2.read(b)) != -1) {
//				System.out.print(count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				input2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("程序2运行时间：" + (endTime2 - startTime2) + "ms"); // 输出程序运行时间
		System.out.println((endTime1 - startTime1)/(endTime2 - startTime2)+"倍");
	}

}
