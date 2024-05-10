package com.springcore.test.intervw;
import java.util.*;


public class occurenceOfElement {

	public static void main(String[] args) {
		String s="hello worldp";
		
		Scanner sc=new Scanner(System.in);
		
		char c=sc.next().charAt(0);
		int t=0;
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)){
				t++;
			}
		}
		System.out.print(t);
		
		

	}

}
