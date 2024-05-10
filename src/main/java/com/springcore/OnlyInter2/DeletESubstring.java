package com.springcore.OnlyInter2;



public class DeletESubstring {
    public static void main(String[] args) {
    	int p=123456789,q=89;
    	
    	String original=Integer.toString(p);
    	String substring=Integer.toString(q);
    	int i=original.indexOf(substring);
    	int j=substring.length();
    	//System.out.println(i+" "+j);
    	System.out.println(original.substring(0,i)+original.substring(i+j,original.length()));
    	
    }
}