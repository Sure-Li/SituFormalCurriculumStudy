package com.situ.test;

public class Circle extends Graph {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("圆的面积为" + radius * radius * 3.14);
	}

}
