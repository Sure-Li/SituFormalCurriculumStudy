package com.situ.test;

public class Dog extends Animal {

	public Dog(String name, double weight, int age) {
		super(name, weight, age);
		// TODO Auto-generated constructor stub
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {

	}

	@Override
	public void roar() {
		System.out.println(this.getName() + "：汪汪汪");
	}

	@Override
	public void sleep() {
		System.out.println(this.getName() + "趴着睡");
	}

	@Override
	public String toString() {
		return "一直叫做" + this.getName() + "的，体重为：" + this.getWeight() + "kg的，年龄为：" + this.getAge() + "岁的狗";
	}
}
