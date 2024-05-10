package com.springcore.test.intervw;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sorted {

	public static void main(String[] args) {
		String str="qwertyuioplkjhgfdsazxcvbnm";
		
		char[] arr=str.toCharArray();
		System.out.println(arr);

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
		}
		
		
		System.out.println(String.valueOf(arr));
		
		
		/*
		 * String s = str.chars() .sorted() .collect(StringBuilder::new,
		 * StringBuilder::appendCodePoint, StringBuilder::append) .toString();
		 * System.out.println(s);
		 */
		
		String sorted =
			    Stream.of(str.split(""))
			        .sorted()
			        .collect(Collectors.joining());
		
		System.out.println(sorted);

	}

}
