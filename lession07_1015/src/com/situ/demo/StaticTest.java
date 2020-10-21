package com.situ.demo;

public class StaticTest {
	private static int staticTest;

	public static void main(String[] args) {
		StaticTest s1 = new StaticTest();
		System.out.println(s1.staticTest);
		StaticTest s2 = new StaticTest();
		System.out.println(s2.staticTest);
		StaticTest s3 = new StaticTest();
		System.out.println(s3.staticTest);
		StaticTest s4 = new StaticTest();
		System.out.println(s4.staticTest);
		StaticTest s5 = new StaticTest();
		System.out.println(s5.staticTest);
	}

	public StaticTest() {
		staticTest += 1;
	}

}
