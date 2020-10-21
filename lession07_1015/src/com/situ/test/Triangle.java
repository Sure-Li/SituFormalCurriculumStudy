package com.situ.test;

public class Triangle extends Shape {

	@Override
	public void area(double... a) {
		// TODO Auto-generated method stub
		System.out.println("三角形面积为：" + a[0] * a[1] / 2);
	}

	@Override
	public void perimeter(double... a) {
		// TODO Auto-generated method stub
		System.out.println("三角形周长为：" + (a[0] + a[1] + a[2]));
	}

}
