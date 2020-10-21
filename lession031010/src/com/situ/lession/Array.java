package com.situ.lession;

import java.util.Random;

public class Array {

	public static void main(String[] args) {
		Random ra = new Random();
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = ra.nextInt();
			System.out.println(array[i]);
		}
		System.out.println("_________________________________");
		for (int j = (array.length - 1); j > array.length / 2; j--) {
			int temp = array[(array.length - 1) - j];
			array[(array.length - 1) - j] = array[j];
			array[j] = temp;
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

}
