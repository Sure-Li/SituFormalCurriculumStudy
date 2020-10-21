package com.situ.simulationest;

public class Test07 {

	public static void main(String[] args) {
		String str1 = "12";
		String str2 = "23";
		char[] charStr1 = str1.toCharArray();
		char[] charStr2 = str2.toCharArray();
		System.out.println("" + swag(charStr1) * swag(charStr2));

	}

	public static int swag(char[] c) {
		int result = 0;
		int temp = 0;
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case '0':
				temp = 0;
				break;
			case '1':
				temp = 1;
				break;
			case '2':
				temp = 2;
				break;
			case '3':
				temp = 3;
				break;
			case '4':
				temp = 4;
				break;
			case '5':
				temp = 5;
				break;
			case '6':
				temp = 6;
				break;
			case '7':
				temp = 7;
				break;
			case '8':
				temp = 8;
				break;
			case '9':
				temp = 9;
				break;
			}
			if (i == 0) {
				result += temp;
			} else {
				for (int j = 0; j < i; j++) {
					temp *= 10;
				}
				result += temp;
			}
		}
		return result;
	}

}
