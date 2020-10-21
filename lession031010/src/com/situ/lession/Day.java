package com.situ.lession;

public class Day {
	public static int day = 6;
	public static String lightColor = "红";

	public static void main(String[] args) {
		if (0 == day) {
			System.out.println("今天是周日");
		} else if (1 == day) {
			System.out.println("今天是周一");
		} else if (2 == day) {
			System.out.println("今天是周二");
		} else if (3 == day) {
			System.out.println("今天是周三");
		} else if (4 == day) {
			System.out.println("今天是周四");
		} else if (5 == day) {
			System.out.println("今天是周五");
		} else if (6 == day) {
			System.out.println("今天是周六");
		} else {
			System.out.println("错误");
		}
		switch (lightColor) {
		case "红":
			System.out.println("禁止通行");
			break;
		case "黄":
			System.out.println("减速通行");
			break;
		case "绿":
			System.out.println("可以通行");
			break;

		default:
			System.out.println("输入错误");
			break;
		}
		int i = 0;
		do {
			System.out.println("__________________________________");
		} while (i >= 10);

	}

}
