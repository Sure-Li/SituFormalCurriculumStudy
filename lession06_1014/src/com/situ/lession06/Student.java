package com.situ.lession06;

public class Student extends Person {

	private double math;
	private double english;

	public Student() {
	}

	public Student(double math, double english) {
		super();
		this.math = math;
		this.english = english;
	}

	public Student(String name, String addr, char sex, int age, double math, double english) {
		super(name, addr, sex, age);
		this.math = math;
		this.english = english;
	}

	@Override
	public String toString() {
		return "Student [math=" + math + ", english=" + english + ", getName()=" + getName() + ", getAddr()="
				+ getAddr() + ", getSex()=" + getSex() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
