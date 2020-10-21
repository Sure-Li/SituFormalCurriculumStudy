package com.situ.simulationest;

public class Test02 {
	private static final int MAX = 100;

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			if ((i % 3 == 0) || (i % 7 == 0)) {
				sum += i;
			}
		}
		System.out.println("100以内的所有3或7的倍数的和为：" + sum);
	}

}
