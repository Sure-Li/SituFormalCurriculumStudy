package com.situ.test;

public class OfficeClerk extends Employee {
	private String department;
	private double monthlySalary;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public OfficeClerk(String name, int age, String sex, String department, double monthlySalary) {
		super(name, age, sex);
		this.department = department;
		this.monthlySalary = monthlySalary;
	}

	@Override
	public void showinfo() {
		System.out.println("姓名为：" + this.getName() + "年龄为：" + this.getAge() + "性别为：" + this.getSex() + "部门为："
				+ this.getDepartment() + "月薪为：" + this.getMonthlySalary() + "元");
	}

}
