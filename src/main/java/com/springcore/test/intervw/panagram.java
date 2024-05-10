package com.springcore.test.intervw;

public class panagram {

	public static void main(String[] args) {
		int flag = 1;
		String s = "The quick brown fox jumps over the lazy dog";
		if (s.length() < 26) {
			flag = 0;

		} else {
			for (char c = 'a'; c <= 'z' && c != ' '; c++) {
				String s1 = String.valueOf(c);
				if (!s.contains(s1)) {
					flag = 0;

				}
			}
		}
		if (flag == 1)
			System.out.println("all available");
		else
			System.out.println("not available");

	}

}
