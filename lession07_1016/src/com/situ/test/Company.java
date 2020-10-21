package com.situ.test;

public class Company {
	private Worker[] worker;

	public Worker[] getWorker() {
		return worker;
	}

	public void setWorker(Worker[] worker) {
		this.worker = worker;
	}

	public Company(Worker[] worker) {
		super();
		this.worker = worker;
	}

	public void salarySum() {
		double sumSalary = 0;
		for (Worker worker2 : this.worker) {
			sumSalary += worker2.calculateSalary();
		}
		System.out.println("总工资为：" + sumSalary);
	}
}
