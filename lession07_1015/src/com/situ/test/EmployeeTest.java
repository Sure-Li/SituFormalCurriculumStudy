package com.situ.test;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee management = new Management("王戈", 40, "男", "研发总监", 20);
		Employee officeClerk = new OfficeClerk("刘能", 55, "男", "后勤", 1000);
		management.showinfo();
		officeClerk.showinfo();
	}

}
