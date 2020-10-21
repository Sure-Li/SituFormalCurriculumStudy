package com.situ.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAddressBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contacts> list = new ArrayList<Contacts>();
		AddressBook addressBook = new AddressBook(list);

		while (true) {
			System.out.println("1增加地址\t2删除地址\t3)查找地址\t0退出系统");
			switch (sc.nextInt()) {
			case 1:
				addressBook.addContactsMessage(sc);
				break;
			case 2:
				addressBook.delContactsMessage(sc);
				break;
			case 3:
				addressBook.getContactsMessage(sc);
				break;
			case 0:
				System.out.println("退出系统成功");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("输入错误 请重新输入");
				break;
			}
		}

	}
}
