package com.situ.simulationest;

public class Test06 {

	public static void main(String[] args) {
		String str1 = "abcdefhhhhhhh";
		String str2 = "abcdeshhhhhhh";

		char[] charStr1 = str1.toCharArray();
		char[] charStr2 = str2.toCharArray();
		int length = (str1.length() < str2.length() ? str1.length() : str2.length());
		String[] reslut = new String[length];
		for (int i = 0; i < reslut.length; i++) {
			reslut[i] = "";
		}
		int reslutCount = 0;
		for (int i = 0; i < length; i++) {
			if ((int) charStr1[i] == (int) charStr2[i]) {
				reslut[reslutCount] += charStr1[i];
			} else {
				reslutCount++;
			}
		}
		int max = 0;
		String maxString = "";
		for (String string : reslut) {
			if (string.length() > max) {
				max = string.length();
				maxString = string;
			}
		}
		System.out.println("最大子串：" + maxString);
	}

}
