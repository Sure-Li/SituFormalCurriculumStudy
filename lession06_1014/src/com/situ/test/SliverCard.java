package com.situ.test;

public class SliverCard extends CreditCard {

	public SliverCard(double maxOverDraft, double balance) {
		super(maxOverDraft, balance);
		// TODO Auto-generated constructor stub
	}

	public SliverCard() {
		// TODO Auto-generated constructor stub
	}

	public SliverCard(double maxOverDraft, double balance, int cardNumber, String name) {
		super(maxOverDraft, balance, cardNumber, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(double money) {
		if ((money > 100000) || (this.getBalance() < money)) {
			System.out.println("取款失败，最高限额100000,或者请检查您的余额");
		} else {
			this.setBalance(this.getBalance() - money);
			System.out.println("取款成功：" + money + "元");
		}
	}

	public SliverCard(double balance, int cardNumber, String name) {
		super(balance, cardNumber, name);
		// TODO Auto-generated constructor stub
	}

}
