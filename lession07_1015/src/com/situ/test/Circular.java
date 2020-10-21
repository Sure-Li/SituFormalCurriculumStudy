package com.situ.test;

public class Circular extends Shape {

	@Override
	public void area(double... a) {
		// TODO Auto-generated method stub
		System.out.println("圆的面积为：" + a[0] * 3.14);
	}

	@Override
	public void perimeter(double... a) {
		// TODO Auto-generated method stub
		System.out.println("圆的周长为" + a[0] * 2 * 3.14);
	}

}
