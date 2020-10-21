package com.situ.test;

public class PetsTest {

	public static void main(String[] args) {
		Pets pet = new Pets("哈哈", 6, 15.0, "狗");
		pet.run();
		pet.eat();
		pet.play();
		pet.sleep();
	}

}
