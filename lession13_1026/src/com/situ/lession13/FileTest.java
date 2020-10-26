package com.situ.lession13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("src\\com\\situ\\lession13");
		System.out.println(file.toURI());
		File[] fileArray = file.listFiles();
		for (File file2 : fileArray) {
			if (file2.isDirectory()) {
				System.out.print("目录：\t");
			} else if (file2.isFile()) {
				System.out.print("文件：\t");
			}
			System.out.println(file2.getName() + "\t大小    " + (file2.length()) / (1024D) + "\tKB");
			Date date = new Date(file2.lastModified());
			System.out.println(new SimpleDateFormat("最后修改时间\t" + "yyyy-MM-dd HH:mm:ss").format(date));
		}
	}
}
