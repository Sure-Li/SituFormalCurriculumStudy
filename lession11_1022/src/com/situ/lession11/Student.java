package com.situ.lession11;

public class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return " name: " + name + " age: " + age;
	}

	public Student() {
		super();
	}

	public void setAge(int age) {
		this.age = age;
	}
}
