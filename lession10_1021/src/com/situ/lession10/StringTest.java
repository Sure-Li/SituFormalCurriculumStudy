package com.situ.lession10;

public class StringTest {

	public static void main(String[] args) {
		// 多个字符串的拼接
		String a = "aaa";
		String b = "bbb";
		String c = "ccc";
		String result1 = a + b + c;
		System.out.println(result1);
		StringBuffer buffer = new StringBuffer();
		buffer.append(a).append(b).append(c);
		System.out.println(buffer);
		System.out.println();

//		StringBuffer buffer1 = new StringBuffer("aaa");
		StringBuffer buffer1 = new StringBuffer(1727321);
		buffer1.append(false);
		buffer1.append(0.0f);
		System.out.println(buffer1);
		for (int i = 0; i < 10; i++) {
			System.out.println("随机数" + (i + 1) + ":    \t" + (int) (Math.random() * 100));
		}

	}

}
