package com.springcore.test.intervw;

public class palidrome {

	public static void main(String[] args) {

		String str = "12321";
		int b = 0;
		int j = str.length() - 1;
		char[] strarr = str.toCharArray();
		for (int i = 0; i < str.length() / 2; i++, j--) {
			System.out.println(i + " " + j);
			if (strarr[i] == strarr[j]) {
				b = 1;
				// System.out.println(i+" "+b);

			}

		}

		if (b == 1)
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");

	}

}
