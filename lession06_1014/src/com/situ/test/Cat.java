package com.situ.test;

public class Cat extends Animal {

	public Cat(String name, double weight, int age) {
		super(name, weight, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void roar() {
		System.out.println(this.getName() + "：喵喵喵");
	}

	@Override
	public void move() {
		System.out.println(this.getName() + "在爬");
	}

	public void sleep() {
		System.out.println(this.getName() + "趴着睡");
	}

	@Override
	public String toString() {
		return "一直叫做" + this.getName() + "的，体重为：" + this.getWeight() + "kg的，年龄为：" + this.getAge() + "岁的猫";
	}

}
