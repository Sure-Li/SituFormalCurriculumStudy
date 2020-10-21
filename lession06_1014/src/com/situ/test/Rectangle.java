package com.situ.test;

public class Rectangle extends Graph {
	private double longSize;
	private double wideSize;

	public Rectangle(double longSize, double wideSize) {
		super();
		this.longSize = longSize;
		this.wideSize = wideSize;
	}

	@Override
	public void area() {
		System.out.println("长方体的面积为："+longSize*wideSize);
	}

}
