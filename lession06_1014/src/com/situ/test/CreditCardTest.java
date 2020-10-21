package com.situ.test;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard normalCreditCard = new CreditCard(1000, 200, 12345, "张");
		CreditCard dragonCreditCard = new DragonCard(500, 12346, "吴");
		CreditCard sliverCreditCard = new SliverCard(1000, 12347, "苏");
		normalCreditCard.deposit(3000);
		normalCreditCard.withDraw(4000);
		dragonCreditCard.deposit(3000);
		dragonCreditCard.withDraw(2900);
		if (dragonCreditCard instanceof DragonCard) {
			DragonCard m = (DragonCard) dragonCreditCard;
			m.payment(500.0);
		}
		sliverCreditCard.deposit(3000);
		sliverCreditCard.withDraw(10000);

	}

}
