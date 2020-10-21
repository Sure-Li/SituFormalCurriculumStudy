package com.situ.test;

public class EmployeeTest {

	public static void main(String[] args) {
		test(new SellEmployee("张三", 5000, 2000.0));
		test(new HourlyEmployee("王五", 50, 200.7));
		test(new NormalEmployee("唯一", 6000, 199.9));
	}

	public static void test(Employee e) {
		System.out.println(e.getName()+"员工工资为：" + e.calculateSalary() + "元");
	}

}
