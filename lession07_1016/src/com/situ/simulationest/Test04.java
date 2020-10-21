package com.situ.simulationest;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		int[] a = { 1, 23, 43, 5 };
		int[] b = { 1, 2, 4, 5, 23, 43, 5 };
		array(a, b);
	}

	public static int[] array(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
		return c;
	}

}
