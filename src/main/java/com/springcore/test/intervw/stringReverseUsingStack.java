package com.springcore.test.intervw;

import java.util.*;

public class stringReverseUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dipak kumar paul";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' ) {
				st.push(s.charAt(i));
			} else {
				while (!st.isEmpty()) {
					System.out.print(st.peek());
					st.pop();
				}
				System.out.print(" ");
			}
		}
		while (!st.isEmpty()) {	
			System.out.print(st.peek());
			st.pop();
		}

	}

}
