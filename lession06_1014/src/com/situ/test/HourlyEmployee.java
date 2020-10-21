package com.situ.test;

public class HourlyEmployee extends Employee {

	private double hour;
	private double hourlySalray;

	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String name, double hour, double hourlySalray) {
		super(name);
		this.hour = hour;
		this.hourlySalray = hourlySalray;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getHourlySalray() {
		return hourlySalray;
	}

	public void setHourlySalray(double hourlySalray) {
		this.hourlySalray = hourlySalray;
	}

	@Override
	public double calculateSalary() {
		return this.getHour() * this.hourlySalray;
	}

}
