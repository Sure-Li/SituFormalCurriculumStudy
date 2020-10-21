package com.situ.test;

public class HourlyWorker implements Worker {
	private double workHour;
	private double hourSalary;

	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}

	public double getWorkHour() {
		return workHour;
	}

	public void setWorkHour(double workHour) {
		this.workHour = workHour;
	}

	public HourlyWorker(double workHour, double hourSalary) {
		super();
		this.workHour = workHour;
		this.hourSalary = hourSalary;
	}

	public HourlyWorker() {
		super();
	}

	@Override
	public double calculateSalary() {

		return this.getHourSalary() * this.getWorkHour();
	}

}
