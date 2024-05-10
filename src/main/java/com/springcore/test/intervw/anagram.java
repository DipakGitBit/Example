package com.springcore.test.intervw;

import java.util.*;

public class anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		int b = 0;
		char[] x1 = str1.toLowerCase().toCharArray();
		char[] x2 = str2.toLowerCase().toCharArray();
		int i, j;
		for (i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {

			if (x1[i] != x2[j]) {
				b = 1;
			}

		}

		if (b == 1) {
			System.out.print("not anagram");
		} else {
			System.out.println("anagram");
		}
		
		
		//using stream
		boolean areAnagrams = Arrays.equals(
				str1.chars().sorted().toArray(),
				str2.chars().sorted().toArray());
		System.out.println(areAnagrams);

	}

}
