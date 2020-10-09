package com.situ.test;

public class NineMultisim {
	public static int mulNum = 9;

	public static void main(String[] args) {
		for (int i = 1; i <= mulNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
