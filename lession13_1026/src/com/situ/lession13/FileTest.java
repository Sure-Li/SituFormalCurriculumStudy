package com.situ.lession13;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("src\\com");
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
	}

}
