package com.situ.test;

public class Management extends Employee {
	private String duty;
	private double yearlySalary;

	public Management(String name, int age, String sex, String duty, double yearlySalary) {
		super(name, age, sex);
		this.duty = duty;
		this.yearlySalary = yearlySalary;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	@Override
	public void showinfo() {
		System.out.println("姓名为：" + this.getName() + "年龄为：" + this.getAge() + "性别为：" + this.getSex() + "职务为："
				+ this.getDuty() + "月薪为：" + this.getYearlySalary()+"万元");
	}

}
