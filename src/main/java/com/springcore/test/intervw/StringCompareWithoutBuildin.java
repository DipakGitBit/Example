package com.springcore.test.intervw;

public class StringCompareWithoutBuildin {

	public static void main(String[] args) {
		
		String str1="dipak";
		String str2="dipak";
		boolean f=false;
		
		for(int i=0,j=0;i<str1.length()&& j<str2.length();i++,j++) {
			if(str1.charAt(i)!=str2.charAt(j)) {
				f=true;
				
			}
		}
		System.out.print(f);



	}

}
