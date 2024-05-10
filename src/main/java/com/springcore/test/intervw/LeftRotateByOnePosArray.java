package com.springcore.test.intervw;

public class LeftRotateByOnePosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,4,5,7,8,9};
		int k=arr[0],j=0;
		for(int i=1;i<arr.length;i++) {
			arr[j++]=arr[i];
		}
		arr[arr.length-1]=k;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
