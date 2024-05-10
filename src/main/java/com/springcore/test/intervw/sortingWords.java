package com.springcore.test.intervw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class sortingWords {

	public static void main(String[] args) {

		String[] sarr = { "aaa", "ddd", "bbb", "rfde", "aadef" };

		for (int i = 0; i < sarr.length; i++) {
			for (int j = i + 1; j < sarr.length; j++) {
				if (sarr[i].compareTo(sarr[j]) > 0) {
					String st = sarr[i];
					sarr[i] = sarr[j];
					sarr[j] = st;
				}

			}
		}

		// Arrays.sort(sarr);
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}

		// sort each words
		String sarr1 = "aba ddd bbb zaz rfde aadef";
		String result = Arrays.stream(sarr1.split(" "))
				.map(word -> Arrays.stream(word.split("")).sorted().collect(Collectors.joining()))
				.collect(Collectors.joining(" "));
		System.out.println(result);

		// sort the words
		String result1 = Arrays.stream(sarr1.split(" ")).sorted()
				.collect(Collectors.joining(" "));
		System.out.println(result1);

	}
}
