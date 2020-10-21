package com.situ.lession;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] sortArray = new int[10];
		TestArray testArray = new TestArray(sortArray);
		testArray.createArray(testArray.testArray, testArray.testArray.length);
		System.out.println(Arrays.toString(testArray.testArray));
		for (int i = 0; i < testArray.testArray.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (testArray.testArray[i] < testArray.testArray[j]) {
					int temp = testArray.testArray[i];
					for (int j2 = i; j2 > j; j2--) {
						testArray.testArray[j2] = testArray.testArray[j2 - 1];
					}
					testArray.testArray[j] = temp;
					System.out.println(Arrays.toString(testArray.testArray));
				}
			}
		}
	}

}
