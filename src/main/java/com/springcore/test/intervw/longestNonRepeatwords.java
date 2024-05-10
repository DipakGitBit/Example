package com.springcore.test.intervw;

import java.util.*;

public class longestNonRepeatwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "asdf lik asdafr ppppppp dipa";
		StringBuilder st = new StringBuilder();
		String[] sarr = s.split(" ");
		for (int i = 0; i < sarr.length; i++) {
			Set<Character> set = new HashSet<>();
			// StringBuilder st=new StringBuilder();
			char[] carr = sarr[i].toCharArray();
			for (int j = 0; j < carr.length; j++) {
				set.add(carr[j]);
			}
			// System.out.println(set);

			if (set.size() == carr.length) {
				if (st.length() < carr.length) {
					// st=null;

					st.delete(0, st.length());
					st.append(carr);
					// System.out.println(st);
				}

			}

		}

		System.out.print(st);

	}

}
