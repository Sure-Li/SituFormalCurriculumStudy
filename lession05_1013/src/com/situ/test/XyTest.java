package com.situ.test;

import java.io.ObjectInputStream.GetField;

public class XyTest {

	public static void main(String[] args) {
		Xy xy = new Xy();
		xy.setX(10);
		xy.setY(20);
		System.out.println("getX:" + xy.getX() + "\tgetY:" + xy.getY());
	}

}
