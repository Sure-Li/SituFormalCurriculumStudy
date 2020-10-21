package com.situ.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生人数");
		int studentNum = sc.nextInt();
		String[][] array = new String[studentNum][3];
		for (int i = 0; i < studentNum; i++) {
			System.out.println("请输入学生" + i + "的姓名");
			array[i][0] = sc.next();
			System.out.println("请输入学生" + i + "的学号");
			array[i][1] = sc.next();
			System.out.println("请输入学生" + i + "的成绩");
			array[i][2] = sc.next();
		}
		for (String[] strings : array) {
			System.out.println(Arrays.toString(strings));
		}
		sc.close();
	}

}
