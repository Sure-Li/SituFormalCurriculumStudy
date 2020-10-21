package com.situ.test;

public class Rectangle extends Shape {

	@Override
	public void area(double... a) {
		System.out.println("长方形面积为:" + a[0] * a[1]);
	}

	@Override
	public void perimeter(double... a) {
		System.out.println("长方形周长为：" + (a[0] + a[1]) * 2);
	}

}
