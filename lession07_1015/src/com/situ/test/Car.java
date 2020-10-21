package com.situ.test;

public class Car extends Vehicle {
	private String wheel1;
	private String wheel2;
	private String wheel3;
	private String wheel4;

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

	public String getWheel3() {
		return wheel3;
	}

	public void setWheel3(String wheel3) {
		this.wheel3 = wheel3;
	}

	public String getWheel4() {
		return wheel4;
	}

	public void setWheel4(String wheel4) {
		this.wheel4 = wheel4;
	}

	public Car(String wheel1, String wheel2, String wheel3, String wheel4) {
		super();
		this.wheel1 = wheel1;
		this.wheel2 = wheel2;
		this.wheel3 = wheel3;
		this.wheel4 = wheel4;
	}
 
	public Car() {
		super();
	}

	@Override
	public void wheelsInfo() {
		// TODO Auto-generated method stub
		System.out.println("汽车：左前轮：" + this.getWheel1() + "右前轮：" + this.getWheel2() + "左后轮：" + this.getWheel3() + "右后轮："
				+ this.getWheel4());
	}

}
