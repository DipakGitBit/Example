package com.springcore.test.intervw;

public class kthlargest {
	
	static int count(int[] arr,int mid) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mid) cnt++;
		}
		
		return cnt;
		
	}

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80};
		int k=2;
		int high=Integer.MIN_VALUE;
		int low=Integer.MAX_VALUE;
		
		for(int n:arr) {
			high=Math.max(high, n);
			low=Math.min(low, n);
		}
		
		while(low<high) {
			int mid=low+(high-low)/2;
			
			if(count(arr,mid)<k) high=mid; else low=mid+1;
		}
		
		System.out.println(low);

	}

}
