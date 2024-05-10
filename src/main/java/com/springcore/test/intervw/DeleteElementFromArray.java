package com.springcore.test.intervw;

import java.util.Arrays;


public class DeleteElementFromArray {
	public static int[] deleteElementfromarray(int[] arr,int ele) {
		
		
		int[] arr2=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(ele!=arr[i]) {
				arr2[j++]=arr[i];
			}
		}
		
		
		return arr2;
		
	}
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,4,5};
		int newarr[]=deleteElementfromarray(arr,3);
		System.out.println(Arrays.toString(newarr));
		
		//using stream
		int[] newArray = Arrays.stream(arr)
                .filter(x -> x != 1)
                .toArray();
		
		System.out.println(Arrays.toString(newArray));
		
	}

}
