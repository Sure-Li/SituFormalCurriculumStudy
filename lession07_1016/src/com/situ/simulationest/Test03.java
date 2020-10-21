package com.situ.simulationest;

public class Test03 {
	private static final int MAX = 1000;

	public static void main(String[] args) {
		int sum;
		for (int i = 1; i < MAX; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println("完数为：" + i);
			}
		}
	}

}
