package com.situ.simulationest;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 1, 4, 2, 3, 6, 1, 5 };
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		int reslutLength = 0;
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == temp) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
			} else {
				temp = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[a.length - 1]) {
				reslutLength = i + 1;
				break;
			}
		}
		System.out.println(Arrays.toString(a));
		int[] b = new int[reslutLength];
		System.arraycopy(a, 0, b, 0, reslutLength);
		int[] d = new int[reslutLength];
		for (int i = 0; i < b.length; i++) {
			d[i] = b[b.length-1 - i];
		}
		System.out.println(Arrays.toString(d));
	}
}
