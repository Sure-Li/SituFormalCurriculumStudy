package com.situ.test;

public class Grade {
	public void printAllGrade(double... num) {
		double sum = 0;
		for (double i : num) {
			sum += i;
		}
		System.out.println("总分为：" + sum);
	}

	public void printAvarage(double... num) {
		double sum = 0;
		for (double i : num) {
			sum += i;
		}
		System.out.println("平均分为：" + sum / num.length);
	}
}
