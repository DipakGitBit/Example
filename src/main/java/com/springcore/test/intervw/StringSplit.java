package com.springcore.test.intervw;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringSplit {

	public static void main(String[] args) {
		// split method
		String str1="dipak-pal";
		String[] arr1=str1.split("-");
		for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		
		
		//regex 
		List<String> str2=Pattern.compile("-").splitAsStream(str1).collect(Collectors.toList());
		for(String st2:str2)
			System.out.println(st2);
		
		//tokenizer
		StringTokenizer str3=new StringTokenizer(str1,"-");
		while(str3.hasMoreTokens()) {
			String s3=str3.nextToken();
			System.out.println(s3);
		}
			

	}

}
