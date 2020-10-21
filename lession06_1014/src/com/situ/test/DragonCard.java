package com.situ.test;

public class DragonCard extends CreditCard {

	public DragonCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DragonCard(double maxOverDraft, double balance, int cardNumber, String name) {
		super(maxOverDraft, balance, cardNumber, name);
		// TODO Auto-generated constructor stub
	}

	public DragonCard(double maxOverDraft, double balance) {
		super(maxOverDraft, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(double money) {
		if ((money > 5000) || (this.getBalance() < money)) {
			System.out.println("取款失败，最高限额5000");
		} else {
			this.setBalance(this.getBalance() - money);
			System.out.println("取款成功：" + money + "元");
		}
	}

	public DragonCard(double balance, int cardNumber, String name) {
		super(balance, cardNumber, name);
		// TODO Auto-generated constructor stub
	}

	public void payment(double money) {
		this.setBalance(this.getBalance() - money);
		System.out.println("电话缴费成功：" + money + "元");
	}

}
