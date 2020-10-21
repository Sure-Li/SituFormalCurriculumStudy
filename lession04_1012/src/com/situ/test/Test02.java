package com.situ.test;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] array = { 23, 12, 3, 4, 55, 16 };
		for (int i = 0; i < array.length/2; i++) {
			int tmp = array[i];
			array[i] = array[array.length - i - 1];
			System.out.println(array[array.length - i - 1]);
			array[array.length - i - 1] = tmp;
		}
		System.out.println(Arrays.toString(array));
	}

}
