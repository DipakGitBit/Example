package com.springcore.test.intervw;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class sortByFrequency {

	public static void main(String[] args) {
		String str = "dipak paul";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if(ch!=' ')
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		Map<Character, Integer> sortedMap = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// another sort method
		// converting map to list

		List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());

		// sorting suing Collections sort method

		Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

		System.out.println(list);
		System.out.print(sortedMap);

	}

}
