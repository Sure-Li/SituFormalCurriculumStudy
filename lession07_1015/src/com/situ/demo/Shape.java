package com.situ.demo;

public class Shape {

	public static void main(String[] args) {
		area(3.8);
		area(4, 5);
		area(10);
	}

	public static void area(double r) {
		System.out.println("圆的面积为：" + r * r * 3.14);
	}

	public static void area(int l, int w) {
		System.out.println("长方形的面积为：" + l * w);
	}

	public static void area(int l) {
		System.out.println("正方形的面积为：" + l * l);
	}
}
