package com.situ.lession13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BatchIO {

	public static void main(String[] args) {
		File file = new File("D:\\src\\com\\situ\\lession13\\test\\Java基础核心总结.pdf");
//		file.getParentFile().mkdirs();//获取父文件

		File file1 = new File("E:\\Java基础核心总结.pdf");
		System.out.println(file.getAbsolutePath() + file.isFile() + file.exists());
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(file);
			output = new FileOutputStream(file1);
			byte[] bytes = new byte[2048];// 相当于缓冲池大小
			// 返回读到的个数
			int length = -1;
			while ((length = input.read(bytes)) != -1) {
				System.out.println(length);
				if (length != 2048) {
					output.write(bytes, 0, length);
				} else {
					output.write(bytes);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("错误");
		} finally {
			try {
				if ((output != null) && (input != null)) {
					// 关闭之前 会自动执行flush 将资源自动写出
					output.close();
					input.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
