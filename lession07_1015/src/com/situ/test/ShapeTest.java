package com.situ.test;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle();
		Shape triangle = new Triangle();
		Shape circle = new Circular();
		rectangle.area(4, 5);
		rectangle.perimeter(4, 5);
		triangle.area(5, 4);
		triangle.perimeter(3, 4, 5);
		circle.area(4);
		circle.perimeter(4);
	}

}
