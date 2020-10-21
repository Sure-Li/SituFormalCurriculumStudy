package com.situ.test;

public class Pets {
	private String nickName;
	private int age;
	private double weight;
	private String type;

	public Pets() {
		super();
	}

	public Pets(String nickName, int age, double weight, String type) {
		super();
		this.nickName = nickName;
		this.age = age;
		this.weight = weight;
		this.type = type;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void run() {
		System.out.println("一只叫做" + nickName + "的" + age + "岁的并且体重为" + getWeight() + "的" + type + "在跑");
	}

	public void eat() {
		System.out.println("一只叫做" + nickName + "的" + age + "岁的并且体重为" + getWeight() + "的" + type + "在吃");
	}

	public void sleep() {
		System.out.println("一只叫做" + nickName + "的" + age + "岁的并且体重为" + getWeight() + "的" + type + "在睡");
	}

	public void play() {
		System.out.println("一只叫做" + nickName + "的" + age + "岁的并且体重为" + getWeight() + "的" + type + "在玩");
	}
}
