package com.situ.lession11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties pr = new Properties();
		pr.put("1", "1");
		pr.put("2", "2");
		pr.put("3", "s是多少");
		System.out.println(pr.get("3"));
		OutputStream output = null;
		try {
			output = new FileOutputStream("1.properties");
			pr.store(output, "注释");
			Set<Object> keySet = pr.keySet();
			for (Object object : keySet) {
				System.out.println(pr.get(object).toString());
			}
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			InputStream din = new FileInputStream("1.properties");
			Properties prIn = new Properties();
			prIn.load(din);
			System.out.println(prIn);
			din.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
