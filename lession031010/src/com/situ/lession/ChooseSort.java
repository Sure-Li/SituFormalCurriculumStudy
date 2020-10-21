package com.situ.lession;

import java.util.Arrays;

public class ChooseSort {

	public static void main(String[] args) {
		int[] sortArray = new int[10];
		TestArray testArray = new TestArray(sortArray);
		testArray.createArray(testArray.testArray, testArray.testArray.length);
		System.out.println(Arrays.toString(testArray.testArray));
		int min = testArray.testArray[0];
		int minCount = 0;
		System.out.println("______________________________");
		for (int i = 0; i < sortArray.length; i++) {
			min = testArray.testArray[i];
			minCount = i;
			for (int j = i; j < sortArray.length; j++) {
				if (min > testArray.testArray[j]) {
					min = testArray.testArray[j];
					minCount = j;
				}
			}
			int temp = testArray.testArray[i];
			testArray.testArray[i] = testArray.testArray[minCount];
			testArray.testArray[minCount] = temp;
			System.out.println(Arrays.toString(testArray.testArray));
		}
	}

}
