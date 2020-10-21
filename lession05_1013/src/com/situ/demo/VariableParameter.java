package com.situ.demo;

public class VariableParameter {

	public static void main(String[] args) {
		sum(1,2,3,5);
	}

	public static void sum(int... num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println(sum);
	}

}
