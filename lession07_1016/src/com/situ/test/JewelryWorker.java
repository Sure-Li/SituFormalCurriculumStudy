package com.situ.test;

public class JewelryWorker implements Worker {
	private double jewelryCount;

	public double getJewelryCount() {
		return jewelryCount;
	}

	public void setJewelryCount(double jewelryCount) {
		this.jewelryCount = jewelryCount;
	}

	public JewelryWorker() {
		super();
	}

	public JewelryWorker(double jewelryCount) {
		super();
		this.jewelryCount = jewelryCount;
	}

	@Override
	public double calculateSalary() {

		return jewelryCount * 50;
	}

}
