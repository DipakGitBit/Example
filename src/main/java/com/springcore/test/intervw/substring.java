package com.springcore.test.intervw;

public class substring {

	public static void main(String[] args) {
		String str = "abada";
		int count = 0;
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));

				// counting no of palindrome in a string
				StringBuilder st = new StringBuilder(str.substring(i, j)).reverse();
				// reverse only work string builder
				if (str.substring(i, j).equals(st.toString())) {
					count++;
					// System.out.println(str.substring(i, j));

				}
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub
//		int n=2;
//		for (int i = 0; i < str.length() - n + 1; i++)
//            System.out.print(str.substring(i, i + n) + " ");

	}

}
