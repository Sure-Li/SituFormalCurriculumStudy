package com.situ.test;

public class NormalEmployee extends Employee {

	private double workhour;

	public NormalEmployee() {
		// TODO Auto-generated constructor stub
	}

	public NormalEmployee(String name, double salary, double workhour) {
		super(name, salary);
		this.workhour = workhour;
	}

	public double getWorkhour() {
		return workhour;
	}

	public void setWorkhour(double workhour) {
		this.workhour = workhour;
	}

	@Override
	public double calculateSalary() {
		double result = this.getSalary();
		if (this.workhour - 196 > 0) {
			result += (this.workhour - 196) * 200;
		} 
		return result;
	}

}
