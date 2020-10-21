package com.situ.lession10;

public class FiledTest {

	public static void main2(String[] args) {
		int a = 6;
		int b = 18;
		change(a, b);
		System.out.println("a:" + a + "b:" + b);
	}

	public static void change(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a:" + a + "b:" + b);
	}

	public static void main(String[] args) {
		Integer age = 18;
		String name = "张胜男";
		change(age,name);
		
		System.out.println("封装类的学生的年龄=" + age+name);
	}

	public static void change(int age,String name) {
		age = 21;
		name= "sd";
		System.out.println("基本数据类型change后学生的年龄-=" + age+name);
	}
}
