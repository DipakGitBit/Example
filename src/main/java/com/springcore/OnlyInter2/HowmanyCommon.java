package com.springcore.OnlyInter2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HowmanyCommon {

	public static void main(String[] args) {
		String str1 = "aaaaaabbbbbcccccc";
		String str2 = "aaabbdddddbbbbaaaaaaa";

		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		for (char c : str1.toCharArray()) {
			set1.add(c);
		}
		for (char c : str2.toCharArray()) {
			set2.add(c);
		}
		int count = 0;
		for (char c : set1) {
			if (set2.contains(c))
				count++;

		}
		System.out.println(count);
		//print ranodm
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.parallelStream().forEach(System.out::print);
		// 2 1 3 4 5
		System.out.println();
		numbers.stream().forEach(System.out::print);
		// 1 2 3 4 5

	}

}
