package com.situ.test;

public class SellWorker implements Worker {
	private double sellCount;

	public double getSellCount() {
		return sellCount;
	}

	public void setSellCount(double sellCount) {
		this.sellCount = sellCount;
	}

	public SellWorker(double sellCounty) {
		super();
		this.sellCount = sellCount;
	}

	public SellWorker() {
		super();
	}


	@Override
	public double calculateSalary() {
		double result = 0;
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
