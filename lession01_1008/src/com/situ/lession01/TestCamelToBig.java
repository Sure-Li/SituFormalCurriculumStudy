package com.situ.lession01;

public class TestCamelToBig {

	public static void main(String[] args) {
		String camel = "stuNameTestDemo";
		long startTime = System.currentTimeMillis(); 
		translate(camel);
		long endTime = System.currentTimeMillis(); 
		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
		long startTime1 = System.currentTimeMillis(); 
		translateWayOther(camel);
		long endTime1 = System.currentTimeMillis(); 
		System.out.println("程序运行时间：" + (endTime1 - startTime1) + "ms");
	}
	// 效率太低
	public static void translate(String camel) {
		// 用于记录字符串长度
		int arrayLength = camel.length();
		// 用于记录大写字母个数
		int upperCount = 0;
		// 将输入的字符串转换为char的数组
		char[] array = camel.toCharArray();
		// 遍历一遍数组 将大写字母的数量统计出来
		for (char c : array) {
			if (((int) c <= 90) && ((int) c >= 65)) {
				upperCount++;
			}
		}
		//创建一个新的字符型数组 用于存放最后结果
		char[] inputArray = new char[arrayLength + upperCount];
		for (int i = 0; i < array.length; i++) {
			inputArray[i] = array[i];
		}
		//
		for (int i = 0; i < (arrayLength + upperCount); i++) {
			if (((int) inputArray[i] <= 90) && ((int) inputArray[i] >= 65)) {
				for (int j = arrayLength + upperCount - 1; j >= i; j--) {
					inputArray[j] = inputArray[j - 1];
				}
				inputArray[i] = '_';
				i++;
			}
		}
		StringBuffer output = new StringBuffer();
		for (char c : inputArray) {
			output.append(c);
		}
		System.out.println(output.toString().toUpperCase());
	}

	public static void translateWayOther(String camel) {
		// 将字符串转化为字符数组
		char[] array = camel.toCharArray();
		// 用于存放
		StringBuffer result = new StringBuffer();
		boolean isUpper;
		// 开始遍历
		for (char c : array) {
			// 判断是否为大写
			//-------------------------------------------------------------------_此处坑点_ 判断字符是否为大小写
			isUpper = Character.isUpperCase(c);
			if (isUpper) {
				result.append('_');
			}
			//-------------------------------------------------------------------_此处坑点_ 小写c————》C
			result.append(Character.toUpperCase(c));
		}
		System.out.println(result);
	}

}
