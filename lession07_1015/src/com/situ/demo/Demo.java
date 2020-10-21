package com.situ.demo;

public class Demo {

	private static void main(String[] args) {
		
	}

}

class A {
	static String str = get();
	static {
		System.out.println("jingtai ");
		System.out.println(str);
	}
	

	public static String get() {

		return "s";
	}
}