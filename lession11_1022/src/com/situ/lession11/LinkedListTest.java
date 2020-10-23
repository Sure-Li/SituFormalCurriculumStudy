package com.situ.lession11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random ra = new Random();
		for (int i = 0; i < 50; i++) {
			arrayList.add(ra.nextInt(100));
		}
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			if (!linkedList.contains(arrayList.get(i))) {
				linkedList.add(arrayList.get(i));
			}
		}
		System.out.println(linkedList);
	}

}
