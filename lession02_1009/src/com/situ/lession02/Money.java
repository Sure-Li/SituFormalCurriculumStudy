package com.situ.lession02;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您工作的天数");
		int day = sc.nextInt();
		System.out.println("工资为"+(day>20?8:4) +"K"); 
		sc.close();
	}

}
