package com.situ.test;

public class Employee {
	private String name;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		return getSalary();
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

}
