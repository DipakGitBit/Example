package com.springcore.test.intervw;

public class ReverseADigit {

	public static void main(String[] args) {
		
		int t=123456789,sum=0,q=0;
		int len=String.valueOf(t).length();
		for(int i=len;i>0;i--) {
			int a=t%10;
			t=t/10;
			sum=sum+(int)Math.pow(10, i-1)*a;
			
			//System.out.println(a+" "+sum);
		}
		System.out.println(sum);

	}

}

// a leap year divisible by 400 or 
//divible by 4 and not divisible by 100
