package com.situ.test;

public class Motobike extends Vehicle {
	private String wheel1;
	private String wheel2;

	public Motobike(String wheel1, String wheel2) {
		super();
		this.wheel1 = wheel1;
		this.wheel2 = wheel2;
	}

	public String getWheel1() {
		return wheel1;
	}

	public void setWheel1(String wheel1) {
		this.wheel1 = wheel1;
	}

	public String getWheel2() {
		return wheel2;
	}

	public void setWheel2(String wheel2) {
		this.wheel2 = wheel2;
	}

	@Override
	public void wheelsInfo() {
		System.out.println("摩托车：前轮：" + this.getWheel1() + "后轮：" + this.getWheel2());
	}

}
