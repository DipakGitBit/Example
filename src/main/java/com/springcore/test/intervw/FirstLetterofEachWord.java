package com.springcore.test.intervw;

public class FirstLetterofEachWord {
//First Letter of Each Word
	public static void main(String[] args) {
		String s = "First Letter of Each Word";
		String[] sarr = s.split(" ");
		for (int i = 0; i < sarr.length; i++) {
			char[] c = sarr[i].toCharArray();
			System.out.println(c[0]);
		}

	}

}
