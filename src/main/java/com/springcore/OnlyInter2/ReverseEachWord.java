package com.springcore.OnlyInter2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "I am Dipak";
		StringBuilder total = new StringBuilder();
		String[] sarr = str.split(" ");
		for (int i = sarr.length - 1; i >= 0; i--) {
			String st = sarr[i];
			StringBuilder newWord = new StringBuilder();
			for (int j = st.length() - 1; j >= 0; j--) {

				newWord.append(st.charAt(j));

			}
			total.append(newWord + " ");

		}
		System.out.print(total);
		
		
		String result = Arrays.stream(str.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				
                .collect(Collectors.joining(" "));
        System.out.println(result);

	}

	

}
