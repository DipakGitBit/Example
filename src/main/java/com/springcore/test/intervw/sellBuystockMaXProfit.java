package com.springcore.test.intervw;


//sell & buy stock MaX Profit
//LIKE arr=[10,20,30,40,90]//max profit=max-min
public class sellBuystockMaXProfit {

	public static void main(String[] args) {
		int mx=Integer.MAX_VALUE;
		int mn=Integer.MIN_VALUE;
		int[] arr= {10,20,30,40,90};
		for(int i=0;i<arr.length;i++) {
			if(mn<arr[i])mn=arr[i];
			if(mx>arr[i])mx=arr[i];
		}
		
		System.out.print(mn-mx);

	}

}
