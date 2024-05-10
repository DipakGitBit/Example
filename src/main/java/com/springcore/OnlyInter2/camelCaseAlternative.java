package com.springcore.OnlyInter2;

public class camelCaseAlternative {

	public static void main(String[] args) {
		String str = "qwerty uiop";

		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0)
				str2.append(str.toUpperCase().charAt(i));
			else
				str2.append(str.toLowerCase().charAt(i));
		}

		System.out.print(str2);

	}

}
