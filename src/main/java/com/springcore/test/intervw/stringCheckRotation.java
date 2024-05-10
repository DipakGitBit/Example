package com.springcore.test.intervw;


//check whether two string are roation of each other
//same length- conatins same character- rotated around of the chracater
public class stringCheckRotation {

	public static void main(String[] args) {
		String s1 = "abcd", s2 = "bcda";
		int flag1 = 1, flag2 = 0, flag3 = 0;
		// CharSequence ch = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {

			if (!s2.contains(String.valueOf(s1.charAt(i)))) {
				flag1 = 0;
				break;
			}
		}
		if (s1.length() == s2.length()) {
			flag2 = 1;
		}
		
		//checking rotation
		StringBuilder sb = new StringBuilder(s1);
		for (int i = 0; i < s1.length(); i++) {
			//sb.append(String.valueOf(s1.charAt(i)));
			String ss="";
			ss=sb.substring(1,sb.length())+sb.charAt(0);
			sb.delete(0, sb.length());
			sb=new StringBuilder(ss);
			if(ss.compareTo(s2)==0) {
				flag3=1;
				break;
			}
			
		}
		//2nd method
		String concatSTR=s1+s1;
		if(concatSTR.contains(s2)) flag3=1;
		
		System.out.print(flag1+" "+flag2+" "+flag3);
		if(flag1==1 && flag2==1 && flag3==1) {
			System.out.print("perfect");
		}

	}

}
