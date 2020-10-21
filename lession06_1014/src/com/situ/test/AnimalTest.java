package com.situ.test;

public class AnimalTest {

	public static void main(String[] args) {
		test(new Cat("99", 10.6, 4));
		test(new Dog("88", 20.6, 5));
		test(new Lion("77", 30.6, 6));
		test(new Dolphin("66", 15.6, 7));
	}

	private static void test(Animal a) {
		System.out.println(a.toString());
		a.eat();
		a.sleep();
		a.move();
		a.roar();
	}

}
