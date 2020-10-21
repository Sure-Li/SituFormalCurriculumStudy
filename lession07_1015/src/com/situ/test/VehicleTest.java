package com.situ.test;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car("锦湖轮胎", "马牌轮胎", "倍耐力轮胎", "米其林轮胎");
		Vehicle motobike = new Motobike("路航轮胎", "佳通轮胎");
		car.wheelsInfo();
		motobike.wheelsInfo();
	}

}
