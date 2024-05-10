package com.springcore.test.intervw;

public class sortArray {

	public static void main(String[] args) {
		int[] arr= {0,1,2,0,0,0,2,2,2,2,1,1,1,1,0,0};
		int[] count=new int[3];
		/*
		 * for(int i=0;i<arr.length;i++) { if(arr[i]==0) count[0]++; else if(arr[i]==1)
		 * count[1]++; else count[2]++; }
		 */
		
		for (int num : arr) {
            count[num]++;
        }
		
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				System.out.print(i+" ");
				count[i]--;
			}
			
		}

	}

}
