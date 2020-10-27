package com.situ.lession14;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderAndWriteTest {

	public static void main(String[] args) {
		InputStream in = new FileInputStream("1.txt");
		Reader reader = new InputStreamReader(in);
	}

}
