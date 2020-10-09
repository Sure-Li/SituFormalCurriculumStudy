package com.situ.test;

public class OddEvenCount {
	public static final int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1,
			2, 3, 9 };

	public static void main(String[] args) {
		int oddCount = 0;
		for (int i : score) {
			if (1 == i % 2) {
				oddCount++;
			}
		}
		System.out.println("奇数个数为" + oddCount + "个，偶数数量为：" + (score.length - oddCount) + "个");
	}

}
