package com.situ.test;

import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private List<Contacts> contactsList;

	public List<Contacts> getContactsList() {
		return contactsList;
	}

	public void setContactsList(List<Contacts> contactsList) {
		this.contactsList = contactsList;
	}

	public AddressBook(List<Contacts> contactsList) {
		super();
		this.contactsList = contactsList;
	}

	public AddressBook() {
		super();
	}

	public void addContactsMessage(Scanner sc) {
		Contacts contactsTemp = new Contacts();
		System.out.println("请输入联系人姓名");
		String inputTemp = sc.next();
		contactsTemp.setName(inputTemp);
		System.out.println("请输入联系人地址");
		inputTemp = sc.next();
		contactsTemp.setAddress(inputTemp);
		System.out.println("请输入联系人手机号");
		inputTemp = sc.next();
		contactsTemp.setPhoneNumber(inputTemp);
		System.out.println("请输入联系人邮箱地址");
		inputTemp = sc.next();
		contactsTemp.setEmail(inputTemp);
		this.contactsList.add(contactsTemp);
	}

	public void delContactsMessage(Scanner sc) {
		boolean isFind = false;
		System.out.println("请输入联系人姓名");
		String inputTemp = sc.next();
		java.util.Iterator<Contacts> it = this.contactsList.iterator();
		while (it.hasNext()) {
			if (it.next().getName().equals(inputTemp)) {
				it.remove();
				System.out.println("此联系人删除成功");
				isFind = true;
			}
		}
		// 可以这样
//		if (linkerList !=null && !linkerList.isEmpty()){
//			for (Iterator<Linker> iterator = linkerList.iterator(); iterator.hasNext();)
//			Linker linker = iterator.next();
//			if( linker ! =nu11) {
//			if (name.equa1s( linker. getName())){
//			}
//			}

//		此处用的迭代器
//		也可以用传对象
//		if((this != null)&&(!this.isEmpty))
//		{
//			
//		}
		if (!isFind) {
			System.out.println("没有找到这个名字，请重新输入");
		}
	}

	public void getContactsMessage(Scanner sc) {
		boolean isFind = false;
		System.out.println("请输入联系人姓名");
		String inputTemp = sc.next();
		java.util.Iterator<Contacts> it = this.contactsList.iterator();
		while (it.hasNext()) {
			Contacts contactsNow = it.next();
			if (contactsNow.getName().equals(inputTemp)) {
				System.out.println("成功找到这个人：\n" + contactsNow.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("没有找到这个名字，请重新输入");
		}
	}

}
