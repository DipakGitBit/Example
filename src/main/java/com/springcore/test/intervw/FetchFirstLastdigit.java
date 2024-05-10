package com.springcore.test.intervw;

public class FetchFirstLastdigit {

	public static void main(String[] args) {
		int t=123456789;
		
		String st=Integer.toString(t);
		
		int div=(int)Math.pow(10,st.length()-1);
		System.out.println(div);
		System.out.println("first element : "+t/div);
		System.out.println("last element : "+t%10);
	}

}
