package com.situ.lession11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Properties;

public class StudentTest {
	private static final boolean CHOOES = false;

	public static void main(String[] args) {
		if (CHOOES) {
			Properties studentProperties = new Properties();
			Student student1 = new Student("王五", 12);
			studentProperties.put(student1.getName(), student1.toString());
			try {
				OutputStream output = new FileOutputStream(new File("student.properties"));
				studentProperties.store(output, "学生类");
				output.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			Properties studentProperties = new Properties();
			try {
				studentProperties.load(new FileInputStream(new File("student.properties")));
				String str = studentProperties.get("王五").toString();
				System.out.println(str);
				String[] strArray = str.split(" ");
				System.out.println(Arrays.toString(strArray));
				Student student = new Student(strArray[2].trim(), Integer.parseInt(strArray[4].trim()));
				System.out.println(student.toString());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
