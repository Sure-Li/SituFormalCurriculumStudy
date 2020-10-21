package com.situ.test;

public class Animal {
	private String name;
	private double weight;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String name, double weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public Animal() {
		super();
	}

	public void eat() {
		System.out.println(this.getName() + "在嚼东西");
	}

	public void sleep() {
		System.out.println(this.getName() + "在睡觉");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}

	public void move() {
		System.out.println(this.getName() + "在移动");
	}

	public void roar() {
		System.out.println(this.getName() + "在吼叫");
	}
}
