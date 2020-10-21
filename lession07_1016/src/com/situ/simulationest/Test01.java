package com.situ.simulationest;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int left = sc.nextInt();
		System.out.println("请输入第二个数");
		int right = sc.nextInt();
		System.out.println("两个数相加的结果为：" + (left + right));
	}

}
