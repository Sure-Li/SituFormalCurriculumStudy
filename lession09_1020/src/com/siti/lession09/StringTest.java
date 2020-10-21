package com.siti.lession09;

//import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		/**
		 * 字符串与数组相互转化
		 */
//		String str = "sds";
//		char[] array = str.toCharArray();
//		System.out.println(Arrays.toString(array));
//		char[] array1 = { '1', '2', '3', '4' };
//		String str1 = String.copyValueOf(array1);
//		System.out.println(str1);
//
//		String str2 = "AA##BB##CC##DD";
//		String[] array2 = str2.split("#");
//		System.out.println(Arrays.deepToString(array2));

		String str3 = "\"stuName\":\"张三\",\"stuAge\":\"23\",\"stuSex\":\"男\"";
		Student student = new Student();
		String[] array3 = str3.split(",");
		for (int i = 0; i < array3.length; i++) {
			String[] array = array3[i].split(":");
			if (array[0].contains("stuName")) {
				student.setStuName(array[1]);
			} else if (array[0].contains("stuAge")) {
				student.setStuAge(Integer.parseInt(array[1].replace("\"", "")));
			} else if (array[0].contains("stuSex")) {
				student.setStuSex(array[1]);
			}
		}
		System.out.println(student.toString());
	}
}
