package com.springcore.test.intervw;


import java.util.*;

public class removeDuplicateCharacterFromString {
	
	public static String Remove(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				sf.append(str.charAt(i));
			}
			
		}
		return sf.toString();
	}
	
	public static void main(String args[]) {
		
		
		System.out.println(Remove("sandeep"));
		
		
	}

}