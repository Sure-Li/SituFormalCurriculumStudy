package com.situ.test;

public class CreditCard {
	private double maxOverDraft;
	private double balance;
	private int cardNumber;
	private String name;

	public CreditCard(double maxOverDraft, double balance) {
		super();
		this.maxOverDraft = maxOverDraft;
		this.balance = balance;
	}

	public CreditCard() {
		super();
	}

	public double getMaxOverDraft() {
		return maxOverDraft;
	}

	public void setMaxOverDraft(double maxOverDraft) {
		this.maxOverDraft = maxOverDraft;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double money) {
		this.setBalance(this.getBalance() + money);
		System.out.println("存款成功：" + money + "元");
	}

	public void withDraw(double money) {
		if ((money > 5000) || (money > (this.getMaxOverDraft() + this.getBalance()))) {
			System.out.println("取款失败，最高限额5000,或者请检查您透支额度");
		} else {
			if ((this.getBalance() < money) && (this.getMaxOverDraft() > (money - this.getBalance()))) {
				this.setBalance(0.0);
				this.setMaxOverDraft(this.getMaxOverDraft() - money);
			} else if (this.getBalance() < money) {
				this.setBalance(this.getBalance() - money);
			}
			System.out.println("取款成功：" + money + "元");
		}
	}

	public CreditCard(double balance, int cardNumber, String name) {
		super();
		this.balance = balance;
		this.cardNumber = cardNumber;
		this.name = name;
	}

	public CreditCard(double maxOverDraft, double balance, int cardNumber, String name) {
		super();
		this.maxOverDraft = maxOverDraft;
		this.balance = balance;
		this.cardNumber = cardNumber;
		this.name = name;
	}
}
