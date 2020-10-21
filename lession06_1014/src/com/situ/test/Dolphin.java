package com.situ.test;

public class Dolphin extends Animal {

	public Dolphin(String name, double weight, int age) {
		super(name, weight, age);
		// TODO Auto-generated constructor stub
	}

	public Dolphin() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleep() {
		System.out.println(this.getName() + "左右脑轮着睡");
	}

	@Override
	public void move() {
		System.out.println(this.getName() + "在游");
	}

	@Override
	public void roar() {
		System.out.println(this.getName() + "在发射声波叫");
	}

	@Override
	public String toString() {
		return "一直叫做" + this.getName() + "的，体重为：" + this.getWeight() + "kg的，年龄为：" + this.getAge() + "岁的海豚";
	}
}
