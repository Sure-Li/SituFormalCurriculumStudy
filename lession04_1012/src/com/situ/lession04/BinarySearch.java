package com.situ.lession04;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 4, 51, 52, 53, 3, 34, 542, 9, 11, 23, 8, 291, 292 };
		System.out.println(Arrays.toString(array));
		System.out.println("进行排序");
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("排序完成");
		BinarySearchHandle(array, 111);
	}

	public static void BinarySearchHandle(int[] array, int num) {
		int maxLength = array.length;
		int minLength = 0;
		int mid = 0;
		// 预防系统卡死 不安排死循环
		for (int i = 0; i < array.length; i++) {
			mid = (minLength + maxLength) / 2;
			if (num > array[mid]) {
				minLength = mid;
			} else if (num < array[mid]) {
				maxLength = mid;
			} else {
				System.out.println("要找的数：" + num + "找到的数：" + array[mid] + "数组里的下标" + mid);
				System.out.println("总共找了" + (i + 1) + "次");
				break;
			}
			// 找不到数据 弹出
			if (mid == (minLength + maxLength) / 2) {
				System.out.println("没有找到");
				System.out.println("总共找了" + (i + 1) + "次");
				break;
			}
		}
	}
}
