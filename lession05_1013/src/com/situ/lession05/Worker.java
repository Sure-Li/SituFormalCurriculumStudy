package com.situ.lession05;

public class Worker {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Worker() {
		super();
	}

	public void work() {
		System.out.println("一位姓名为：" + getName() + "的员工正在工作,他 的年龄为" + getAge() + "岁");
	}

	public void clockIn() {
		System.out.println("一位姓名为：" + getName() + "的员工打卡成功,他 的年龄为" + getAge() + "岁");
	}
}
 