package com.situ.demo;

public class Instanceof {

	public static void main(String[] args) {
		Man m = new Man();
		test(m);
	}

	public static void test(Person p) {
		if (p instanceof Women) {
			Women m = (Women) p;
			m.shop();
		}
		if (p instanceof Man) {
			Man m = (Man) p;
			m.somke();
		}
	}
}
