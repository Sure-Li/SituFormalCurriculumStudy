package com.situ.lession11;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("haha", "哈哈");
		System.out.println(map.get("haha"));
	}

}
