package com.situ.test;

import java.util.Scanner;

public class PeopleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户姓名");
		String name = sc.next();
		System.out.println("请输入用户年龄");
		int age = sc.nextInt();
		System.out.println("请输入用户性别");
		String sex = sc.next();
		System.out.println("情书用户生日");
		int birthday = sc.nextInt();
		System.out.println("请输入用户手机号");
		String phoneNum = sc.next();
		System.out.println("请输入用户邮箱地址");
		String email = sc.next();
		System.out.println("请输入用户爱好");
		String hobby = sc.next();
		People p = new People(name, age, sex, birthday, phoneNum, email, hobby);
		System.out.println(p.toString());
	}

}
