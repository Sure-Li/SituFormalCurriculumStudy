package com.situ.test;

public class NormalWorker implements Worker {

	private double workhour;

	public NormalWorker(double workhour) {
		super();
		this.workhour = workhour;
	}

	public NormalWorker() {
		super();
	}

	public double getWorkhour() {
		return workhour;
	}

	public void setWorkhour(double workhour) {
		this.workhour = workhour;
	}

	@Override
	public double calculateSalary() {
		double result = 0;
		if (this.workhour - 196 > 0) {
			result += (this.workhour - 196) * 200;
		}
		return result;
	}

}
