package com.situ.test;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard card1 = new CreditCard(0);
		CreditCard card2 = new CreditCard(0);
		System.out.println("card1：");
		card1.topUp(1000);
		card1.topUp(600);
		card1.showMoney();
		card1.isOverDraft();
		System.out.println("card2：");
		card2.topUp(500);
		card2.cost(600);
		card2.showMoney();
		card2.isOverDraft();
	}

}
