package com.situ.test;

public class WorkerTest {

	public static void main(String[] args) {
		Worker[] workers = { new HourlyWorker(10, 200), new HourlyWorker(10, 230), new SellWorker(5000),
				new SellWorker(200000), new NormalWorker(205), new JewelryWorker(30) };
		Company company = new Company(workers);
		company.salarySum();
	}

}
