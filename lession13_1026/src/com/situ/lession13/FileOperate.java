package com.situ.lession13;

import java.io.File;
import java.io.IOException;

public class FileOperate {

	public static void main(String[] args) {
		File file = new File("1.txt");
		try {
			file.createNewFile();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			System.out.println("文件创建失败");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (file.exists()) {
			file.delete();
		}

	}

}
