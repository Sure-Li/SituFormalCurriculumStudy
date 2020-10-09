package com.situ.test;

public class Rhombus {
	public static int rhombusNum = 4;

	public static void main(String[] args) {
		for (int i = 0; i < rhombusNum; i++) {
			for (int j = 0; j < rhombusNum - i; j++) {
				System.out.print(" ");
			}
			for (int j1 = 0; j1 < i * 2 + 1; j1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i1 = rhombusNum - 1; i1 > 0; i1--) {
			for (int j2 = rhombusNum - i1; j2 >= 0; j2--) {
				System.out.print(" ");
			}
			for (int j3 = i1 * 2 - 1; j3 > 0; j3--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
