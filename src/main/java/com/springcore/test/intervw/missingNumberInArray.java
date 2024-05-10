package com.springcore.test.intervw;

import java.util.*;

public class missingNumberInArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		HashSet<Integer> set = new HashSet<Integer>();
		for (int n : num) {
			set.add(n);
		}

		int t = num.length + 1;
		int totalSumexpected = (t * (t + 1)) / 2;

		int totalSum = 0;

		System.out.println(set);

		for (int i = 1; i < num.length; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
			totalSum = totalSum + num[i];

		}

		System.out.println(totalSumexpected - totalSum - 1);

		char[] ch = { 'a', 'b', 'c', 'e', 'f', 'h', 'i' };

		HashSet<Character> setChar = new HashSet<Character>();
		for (char c : ch) {
			setChar.add(c);
		}

		System.out.println(setChar);
		// System.out.println((char)(ch.length+97));

		for (int i = 0; i < ch.length; i++) {
			if (!setChar.contains((char) (i + 97))) {

				System.out.println((char) (i + 97));// 3 6
			}
		}
		
		
		int[] arr = { 2, 4, 6, 1, 7 };
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int tp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			++tp;
			if (!Arrays.toString(arr).contains(String.valueOf(tp))) {
				System.out.print(tp);
				// break;
			}

		}

	}

}
