package com.springcore.test.intervw;

import java.util.*;
import java.util.Map.Entry;

//"aabbccc" print like "a2b2c3"
public class wordlength {

	public static void main(String[] args) {
		String s = "aabbccc";
		char[] carr = s.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(carr[i], map.containsKey(carr[i]) ? map.get(carr[i]) + 1 : 1);
		}
		// System.out.print(map);
		StringBuilder str = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			str.append(entry.getKey());
			str.append(entry.getValue());
		}
		System.out.println(str);

	}

}
