package com.springcore.test.intervw;

public class ReverseArrayElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int i=0,j=arr.length-1;
		while(i<=j) {
			int t=arr[j];
			arr[j]=arr[i];
			arr[i]=t;
			i++;j--;
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
