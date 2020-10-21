package com.situ.lession;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random ra = new Random();
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = ra.nextInt(9);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1-i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}

	}
	

}
