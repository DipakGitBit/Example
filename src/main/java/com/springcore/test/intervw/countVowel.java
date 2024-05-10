package com.springcore.test.intervw;

public class countVowel {

	public static void main(String[] args) {
		String str = "asdfghjiokl";
		// char[] vowel= {'a','e','i','o','u'};
		String vowel = "aeiuo";
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			String s = String.valueOf(c[i]);// char array to string
			if (!vowel.contains(s)) {
				System.out.print(c[i]);
			}
		}

		//String[] charArray = str.chars().mapToObj(x -> String.valueOf((char) x)).toArray(String[]::new);
		//string to string array
		
		
		System.out.println("\ncount found : ");
		int count = 0;
		for (char cs : c) {
			switch (cs) {
			case 'a':
			case 'e':
			case 'o':
			case 'i':
			case 'u':
				count++;
				break;

			}
		}
		System.out.println(count);
		// The indexOf() method returns the position of the first occurrence of
		// specified character(s) in a string.
		// each character z of string searching in aeiou , if found then return
		// position, else return -1
		long vowelCount = str.toLowerCase().chars().filter(z -> "aeiou".indexOf(z) != -1).count();

		System.out.println("Number of vowels: " + vowelCount);

	}

}
