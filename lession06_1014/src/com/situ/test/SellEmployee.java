package com.situ.test;

public class SellEmployee extends Employee {
	private double sellCount;

	public SellEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SellEmployee(String name, double salary, double sellCount) {
		super(name, salary);
		this.sellCount = sellCount;
		// TODO Auto-generated constructor stub
	}

	public double getSellCount() {
		return sellCount;
	}

	public void setSellCount(double sellCount) {
		this.sellCount = sellCount;
	}

	@Override
	public double calculateSalary() {
		double result = this.getSalary();
		if (this.sellCount < 10000) {
			result += this.sellCount * 0.1;
		} else if ((this.sellCount <= 100000) && (this.sellCount >= 10000)) {
			result += this.sellCount * 0.15;
		} else {
			result += this.sellCount * 0.18;
		}
		return result;
	}

}
