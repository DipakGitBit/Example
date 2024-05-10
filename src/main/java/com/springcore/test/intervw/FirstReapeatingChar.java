package com.springcore.test.intervw;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstReapeatingChar {

	static void FirstRepeat() {

		int[] ch = new int[26];
		String str = "sgSbska";
		System.out.print("get First  Reapeating character :");
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			ch[arr[i] - 'a']++;
		}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 1) {
				int a = 97 + i;
				System.out.println((char) a);
				break;
			}
		}
		

	}

	public static void getFirstNonReapeating() {
		String str = "asga";
		System.out.print("get First Non Reapeating character :");
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		// linkedhashmap provide insertion order, that why we use it
		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);

		}
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		

	}

	public static void getFirstNonReapeating2() {
		System.out.print("get First Non Reapeating character2 :");
		String str = "asga";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
				}
			}
			if (count == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}
	
	public static void usingLambda(){
		
		String str = "asga";
		

		
		Optional<Character> firstRepeated = str.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new, (map, ch) -> map.merge(ch, 1, Integer::sum), LinkedHashMap::putAll)
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
		
	}

	public static void main(String[] args) {
		// System.out.print("get First Reapeating character :");
		FirstRepeat();
		getFirstNonReapeating();
		// System.out.println("get First Non Reapeating character :" + c);
		// System.out.print("get First Non Reapeating character2 :");
		getFirstNonReapeating2();

	}

}
