package com.situ.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入裁判人数");
		int judgeNum = sc.nextInt();
		double[] array = new double[judgeNum];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "位裁判的打分：");
			array[i] = sc.nextDouble();
		}
		sc.close();
		double max = array[0];
		double min = array[0];
		double sum = 0;
		for (double i : array) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
			sum += i;
		}
		System.out.println("平均分为：" + (sum - max - min) / (array.length - 2) + "分");
	}
}
