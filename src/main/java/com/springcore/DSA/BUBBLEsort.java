package com.springcore.DSA;

import java.util.Arrays;

public class BUBBLEsort {

	static void bubbleSort() {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swap = false;
			System.out.print("|");
			for (int j = 0; j < arr.length - 1 - i; j++) {
				System.out.print(".");
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}

		System.out.println(Arrays.toString(arr));

	}
	
	static void bubbleSortWithChar() {
		Character[] arr = { 'a','c','b','f','e' };
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swap = false;
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				if (arr[j] > arr[j + 1]) {
					char t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}

		System.out.println(Arrays.toString(arr));

	}
	
	static void bubbleSortWithString() {
		String[] arr = { "son","abash","aabi","bibas","bab","aab" };
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swap = false;
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				if (arr[j].compareTo(arr[j + 1])>0) {
					String t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		bubbleSort();
		bubbleSortWithChar();
		bubbleSortWithString();

	}

	// sorting with character
	// sorting with string array

}
