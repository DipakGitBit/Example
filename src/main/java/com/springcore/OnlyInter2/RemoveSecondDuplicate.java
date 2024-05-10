package com.springcore.OnlyInter2;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveSecondDuplicate {

	public static void main(String[] args) {
		//REMOVE second duplicate
		String str = "ababcdabcdecde";
		// ababcdcdee
		

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) + 1 : 1);
		}
		System.out.println(map);
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			int cnt = map.get(c);
			if (cnt <= 2) {
				sb.append(c);
			}
			map.put(c, cnt - 1);
		}
		System.out.println(sb);

	}

}
