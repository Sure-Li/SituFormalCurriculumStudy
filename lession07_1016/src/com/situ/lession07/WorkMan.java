package com.situ.lession07;

public class WorkMan implements Employee {

	@Override
	public void work() {
		System.out.println("员工在工作");
	}

	@Override
	public void meeting() {
		System.out.println("员工在开会");
	}

}
