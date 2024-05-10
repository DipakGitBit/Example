package com.springcore.test.intervw;

import java.util.*;
import java.util.Map.Entry;

// count vowel , word, and each characters.
public class PrintNoofWordsVowels {

	public static void printCount(String str) {
		String[] sarr = str.split(" ");
		System.out.println("no of words : " + sarr.length);
		String vowel = "aeiou";
		int v = 0, cons = 0;
		char[] carr = str.toLowerCase().toCharArray();
		int[] alpha = new int[26];
		// System.out.println("char array size : " + carr.length);
		for (int i = 0; i < carr.length; i++) {
			if (vowel.contains(String.valueOf(carr[i]))) {
				v++;
			} else if (carr[i] != ' ')
				cons++;
			if (carr[i] != ' ')
				alpha[carr[i] - 'a']++;
		}
		System.out.println("no of vowel : " + v);
		System.out.println("no of constonent : " + cons);
		int uppercase = 0, lowercase = 0;
		char[] carr1 = str.toCharArray();
		for (int i = 0; i < carr1.length; i++) {
			if (carr[i] != ' ') {
				int t = (int) carr1[i];
				if (t >= 65 && t < 97)
					uppercase++;
				else
					lowercase++;
			}

		}
		System.out.println("no of uppercase : " + uppercase + " no of lowercase : " + lowercase);

		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] > 0) {
				int t = 97 + i;
				System.out.println("count of " + (char) t + ": " + alpha[i]);
			}
		}

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getKey() != ' ')
				System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

	public static void main(String[] args) {
		String str = "dipak paul DIPAK PAUL";
		printCount(str);

	}

}
