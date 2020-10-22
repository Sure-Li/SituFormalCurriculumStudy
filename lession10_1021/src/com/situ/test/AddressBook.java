package com.situ.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class AddressBook {
	private Properties addressBookProperties;

	public Properties getAddressBookProperties() {
		return addressBookProperties;
	}

	public void setAddressBookProperties(Properties addressBookProperties) {
		this.addressBookProperties = addressBookProperties;
	}

	public AddressBook() {
		super();
	}

	public AddressBook(Properties addressBookProperties) {
		super();
		this.addressBookProperties = addressBookProperties;
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
		this.addressBookProperties.put(contactsTemp.getName(), contactsTemp.toString());
		this.saveContactsMessage();
	}

	/**
	 * 
	 * @param sc Scanner 用于输入信息
	 */
	public void delContactsMessage(Scanner sc) {
		boolean isFind = false;
		System.out.println("请输入联系人姓名");
		String inputTemp = sc.next();
		Set<Object> addressBookPropertiesKeySet = this.addressBookProperties.keySet();
		for (Object object : addressBookPropertiesKeySet) {
			if (object.equals(inputTemp)) {
				isFind = true;
			}
		}

		if (!isFind) {
			System.out.println("没有找到这个名字，请重新输入");
		} else {
			this.addressBookProperties.remove(inputTemp);
			this.saveContactsMessage();
		}
	}

	public void getContactsMessage(Scanner sc) {
		boolean isFind = false;
		Set<Object> addressBookPropertiesKeySet = this.addressBookProperties.keySet();
		System.out.println("请输入联系人姓名");
		String inputTemp = sc.next();
		for (Object object : addressBookPropertiesKeySet) {
			if (object.toString().equals(inputTemp)) {
				System.out.println("查找结果为：" + this.addressBookProperties.get(object));
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("没有找到这个名字，请重新输入");
		}
	}

	public void showContactsMessage() {
		Properties propertiesTemp = new Properties();
		try {
			propertiesTemp.load(new FileInputStream("addressBook.properties"));
			System.out.println("加载通讯簿信息成功");
		} catch (IOException e) {
			System.out.println("加载通讯簿信息失败");
			e.printStackTrace();
		}
		this.setAddressBookProperties(propertiesTemp);
		Set<Object> addressBookPropertiesKeySet = propertiesTemp.keySet();
		for (Object object : addressBookPropertiesKeySet) {
			System.out.println(this.addressBookProperties.get(object));
		}
	}

	private void saveContactsMessage() {
		try {
			this.addressBookProperties.store(new FileOutputStream("addressBook.properties"), "addressBook");
			System.out.println("保存信息成功");
		} catch (IOException e) {
			System.out.println("保存信息失败");
			e.printStackTrace();
		}
	}
}
