package com.situ.weektest02.test07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;


public class ClbumTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		List<Clbum> clbumArary = new ArrayList<Clbum>();
//		读取
		try {
			p.load(new FileInputStream("Clbum.properites"));

			Set<Object> plist = p.keySet();
			System.out.println(plist);
			java.util.Iterator<Object> it = plist.iterator();
			while (it.hasNext()) {
				Object pObject = it.next();
				clbumArary.add(new Clbum(pObject.toString(), getList(p.get(pObject).toString()).size(),
						getList(p.get(pObject).toString())));
			}

			System.out.println(clbumArary);

		} catch (IOException e) {
			System.out.println("磁盘中不存在这个文件，请创建");
		}
		taskHandle(new Scanner(System.in), p, clbumArary);
	}

	public static void taskHandle(Scanner sc, Properties p, List<Clbum> clbumArary) {
		while (true) {
			System.out.println("请根据下列提示进行输入");
			System.out.println("1:查看模块;2:新增模块;3:删除模块;0:退出;");

			switch (sc.nextInt()) {
			case 0:
				System.out.println("退出成功");
				sc.close();
				System.exit(0);
				break;
			case 1:
				functionOne(sc, p);
				break;
			case 2:
				functionTwo(sc, p, clbumArary);
				break;
			case 3:
				functionThree(sc, p, clbumArary);
				break;

			default:
				System.out.println("输入错误请重新输入");
				break;
			}
		}
	}

	public static void functionOne(Scanner sc, Properties p) {
		boolean isFind = false;
		System.out.println("请输入班级名称");
		String str = sc.next();
		java.util.Iterator<Object> it = p.keySet().iterator();
		while (it.hasNext()) {
			if (it.next().equals(str)) {
				System.out.println("班级的学生信息为：");
				System.out.println(p.get(str));
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("没有找到，请重新输入");
		}
	}

	public static void functionTwo(Scanner sc, Properties p, List<Clbum> clbumArary) {

		System.out.println("请输入选择功能：1 新增班级 2 新增学生");
		switch (sc.nextInt()) {
		case 1:
			List<Student> list = new ArrayList<Student>();
			System.out.println("请输入新建班级的名称");
			String strTemp = sc.next();
			java.util.Iterator<Object> it = p.keySet().iterator();
			while (it.hasNext()) {
				if (it.next().equals(strTemp)) {
					System.out.println("班级已经存在 无法创建 请重新输入：");
					break;
				}
			}
			Clbum result = new Clbum(strTemp, list.size(), list);
			clbumArary.add(result);
			p.put(result.getName(), list.toString());
			// 保存一下
			try {
				p.store(new FileOutputStream("Clbum.properites"), "保存班级");
			} catch (IOException e) {
				System.out.println("创建班级后，保存班级信息失败");
			}
			break;
		case 2:
			System.out.println("请输入班级的名称");
			String clbumString = sc.next();
			java.util.Iterator<Clbum> it1 = clbumArary.iterator();
			while (it1.hasNext()) {
				Clbum clbumOne = it1.next();
				if (clbumOne.getClbumName().equals(clbumString)) {
					System.out.println("查找班级成功，请按照下面提示分别输入数据");
					System.out.println("请输入学生的学号");
					System.out.println("请输入学生的姓名");
					System.out.println("请输入学生的年龄");
					Student studentAdd = new Student(sc.next(), sc.next(), sc.nextInt());
					List<Student> add = clbumOne.getStudentList();
					add.add(studentAdd);
					clbumOne.setStudentList(add);
					p.setProperty(clbumString, add.toString());
					// 保存一下
					try {
						p.store(new FileOutputStream("Clbum.properites"), "保存班级");
					} catch (IOException e) {
						System.out.println("创建班级后，保存班级信息失败");
					}
					break;
				}
			}
			break;

		default:
			System.out.println("输入错误 请重新输入");
			break;
		}

	}

	public static void functionThree(Scanner sc, Properties p, List<Clbum> clbumArary) {

		System.out.println("请输入选择功能：1 删除班级 2 删除学生");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("你确定要删除吗？Y/N");
			String intputChoose = sc.next();
			if (intputChoose.equals("N")) {
				System.out.println("请重新选择功能");
			} else if (intputChoose.equals("Y")) {
				System.out.println("请输入删除班级的名称");
				String strTemp = sc.next();
				java.util.Iterator<Object> it = p.keySet().iterator();
				while (it.hasNext()) {
					String clbum = it.next().toString();
					if (clbum.equals(strTemp)) {
						it.remove();
						System.out.println("班级已成功删除");
						break;
					}
				}
				// 保存一下
				try {
					p.store(new FileOutputStream("Clbum.properites"), "保存班级");
				} catch (IOException e) {
					System.out.println("创建班级后，保存班级信息失败");
				}
			} else {
				System.out.println("输入错误 请重新选择功能");
			}

			break;
		case 2:
			System.out.println("你确定要删除吗？Y/N");
			String intputChoose1 = sc.next();
			if (intputChoose1.equals("N")) {
				System.out.println("请重新选择功能");
			} else if (intputChoose1.equals("Y")) {
				System.out.println("请输入班级的名称");
				String clbumString = sc.next();
				java.util.Iterator<Clbum> it1 = clbumArary.iterator();
				while (it1.hasNext()) {
					Clbum clbumOne = it1.next();
					if (clbumOne.getClbumName().equals(clbumString)) {
						// 找到班级
						System.out.println("查找班级成功，请按照下面提示分别输入数据");
						System.out.println("请输入学生的学号");
						List<Student> resultList = clbumOne.getStudentList();
						java.util.Iterator<Student> it2 = resultList.iterator();
						while (it2.hasNext()) {
							if (it2.next().getStudentName().equals(sc.next())) {
								System.out.println("成功找到此学生，删除成功");
								it2.remove();
							}
						}
						clbumOne.setStudentList(resultList);
						p.setProperty(clbumString, resultList.toString());
						// 保存一下
						try {
							p.store(new FileOutputStream("Clbum.properites"), "保存班级");
						} catch (IOException e) {
							System.out.println("创建班级后，保存班级信息失败");
						}
						break;
					}
				}
			} else {
				System.out.println("输入错误 请重新选择功能");
			}
			break;

		default:
			System.out.println("输入错误 请重新输入");
			break;
		}

	}

	public static List<Student> getList(String string) {
		List<Student> result = new ArrayList<Student>();
		String[] arrayOne = string.split("-");
		String[] arraythree = null;
		for (int i = 1; i < arrayOne.length - 1; i++) {
			if (i % 2 == 1) {
				String[] arrayTwo = arrayOne[i].split(",");
				String studentId = null;
				String studentName = null;
				Integer studentAge = null;
				for (int j = 0; j < arrayTwo.length; j++) {
					arraythree = arrayTwo[j].split("：");
					if (arraythree[0].equals("studentId")) {
						studentId = arraythree[1];
					} else if (arraythree[0].equals("studentName")) {
						studentName = arraythree[1];
					} else if (arraythree[0].equals("studentAge")) {
						studentAge = Integer.parseInt(arraythree[1]);
					}
				}

				Student stu = new Student(studentId, studentName, studentAge);
				result.add(stu);
			}
		}
		return result;
	}
}
