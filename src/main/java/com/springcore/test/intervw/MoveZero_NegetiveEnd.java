/**
 * 
 */
package com.springcore.test.intervw;

public class MoveZero_NegetiveEnd {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,-4,-2,-1,2};
		int[] arr2= new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr2[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0) {
				arr2[j++]=arr[i];
			}
		}
		
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n");
		
		int[] srr= {1,2,0,0,5,6,0,5,0,0,2};
		int[] srr2= new int[srr.length];
		j=0;
		for(int i=0;i<srr.length;i++) {
			if(srr[i]>0) {
				srr2[j++]=srr[i];
			}
		}
		for(int i=0;i<srr.length;i++) {
			if(srr[i]<=0) {
				srr2[j++]=srr[i];
			}
		}
		
		
		for(int i=0;i<srr2.length;i++) {
			System.out.print(srr2[i]+" ");
		}

	}

}
