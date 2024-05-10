package com.springcore.test.intervw;

import java.util.Arrays;
import java.util.List;

public class ReverseString {

	static void Reverse(String str) {
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	static void ReverseEachWord(String str) {
		System.out.println("\n");
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {

			char[] x = arr[i].toCharArray();
			for (int j = arr[i].length() - 1; j >= 0; j--) {

				// System.out.print(x[j]);

			}
			System.out.print(" ");
		}

	}

	public static String ReverseRecurtion(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		System.out.println(str.substring(1) + " " + str.charAt(0));
		return ReverseRecurtion(str.substring(1)) + str.charAt(0);
		// str.substring(1) means ipak // str.charAt(0) means d;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse("i am dipak");
		// System.out.println(Reverse(""));
		ReverseEachWord("i am dipak");
		System.out.println();
		System.out.println(ReverseRecurtion("dipak"));

	}

}
