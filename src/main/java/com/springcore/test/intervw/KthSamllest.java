package com.springcore.test.intervw;

import java.util.Arrays;
import java.util.OptionalInt;

//Java code for nth smallest element in an array


class KthSamllest {
	static int count(int[] nums, int mid) {
		// function to calculate number of elements less
		// than equal to mid
		int cnt = 0;

		for (int i = 0; i < nums.length; i++)
			if (nums[i] <= mid)
				cnt++;
			//if (nums[i] > mid)//for kth largest
			//	cnt++;

		return cnt;
	}

	static int kthSmallest(int[] nums, int k) {
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		// calculate minimum and maximum the array.
		for (int i = 0; i < nums.length; i++) {
			low = Math.min(low, nums[i]);
			high = Math.max(high, nums[i]);
		}
		// Our answer range lies between minimum and maximum
		// element of the array on which Binary Search is
		// Applied
		while (low < high) {
			int mid = low + (high - low) / 2;
			/*
			 * if the count of number of elements in the array less than equal to mid is
			 * less than k then increase the number. Otherwise decrement the number and try
			 * to find a better answer.
			 */
			/*
			 * if (count(nums, mid) < k) high= mid;//for kth largest
			 * else low = mid+1;
			 */
			
			 if (count(nums, mid) < k) low = mid+1; else high = mid ;
			 
		}

		return low;
	}

	// Driver's code
	public static void main(String[] args) {
		int arr[] = { 10,20,30,40,50,60,70,80 };
		int k =4;

		// Function call
		System.out.println("Kth smallest element is " + kthSmallest(arr, k));
		
		
		
		//int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        int key = 4;

        OptionalInt kthSmallest = Arrays.stream(arr)
                                .distinct() // Optional: If you want to consider distinct elements only
                                .sorted()
                                .skip(key -1)
                                .findFirst();
                               //.orElseThrow();
        //if i use normal int kthsammlest , then we need thorw orElseThrow(), 
        //if we use OptionalInt then no need to thorw orElseThrow(),  
        
        System.out.println("Kth smallest element is " + kthSmallest);
	}
}