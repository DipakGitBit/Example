package com.springcore.CoreJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
import java.io.*;

public class test5 {

	public static void main(String[] args) {

		String str = "abcddefg";
		int k = 3;

		HashMap<Character, Integer> map = new HashMap<>();

		int i = 0, j = 0;
		int count = 0;

		while (j < str.length()) {

			map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

			if (map.size() <= k) {

				count = Math.max(count, j - i + 1);

			}

			while (map.size() > k) {

				if (map.containsKey(str.charAt(i))) {

					map.put(str.charAt(i), map.get(str.charAt(i)) - 1);

					if (map.get(str.charAt(i)) == 0)
						map.remove(str.charAt(i));

					i++;

				}

			}

			j++;

		}

	}

}
