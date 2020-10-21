package com.situ.test;

public class CreditCard {
	private int balance;

	public CreditCard() {
		super();
	}

	public CreditCard(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void topUp(int topUpNum) {
		this.setBalance(getBalance() + topUpNum);
		System.out.println("充值成功" + topUpNum + "元");
	}

	public void cost(int costNum) {
		this.setBalance(getBalance() - costNum);
		System.out.println("充值成功" + costNum + "元");
	}

	public void showMoney() {
		System.out.println("您账户还有" + getBalance() + "元");
	}

	public void isOverDraft() {
		if (this.getBalance() < 0) {
			System.out.println("您的信用卡已经透支");
		} else {
			System.out.println("您的信用卡状态正常");
		}
	}
}
