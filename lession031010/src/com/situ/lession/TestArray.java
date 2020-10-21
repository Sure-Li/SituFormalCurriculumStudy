package com.situ.lession;

import java.util.Random;

public class TestArray {
	int[] testArray;
	
	public TestArray(int[] testArray) {
		super();
		this.testArray = testArray;
	}

	public void createArray(int[] inputArray, int arrayLength) {
		Random ra = new Random();
		for (int i = 0; i < arrayLength; i++) {
			inputArray[i] = ra.nextInt(9);
		}
		System.out.println("Create");
	}

	public void swag(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
