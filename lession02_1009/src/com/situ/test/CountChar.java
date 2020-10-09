package com.situ.test;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符");
		String inputString = sc.next();
		sc.close();
		int countCN = 0;
		int countLetter = 0;
		int countNumber = 0;
		char[] inputArray = inputString.toCharArray();
		for (char c : inputArray) {
			if (c >= 0x4E00 && c <= 0x9FA5) {
				countCN++;
			} else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				countLetter++;
			} else if (c >= 48 && c <= 57) {
				countNumber++;
			}
		}
		System.out.println("中文字符有" + countCN + "个，英文字符有" + countLetter + "个，数字有" + countNumber + "个，其他字符有"
				+ (inputString.length() - countCN - countLetter - countNumber) + "个");
	}

}
