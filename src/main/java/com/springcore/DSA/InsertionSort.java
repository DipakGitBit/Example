package com.springcore.DSA;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 5 };

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1, temp = arr[i];
			while (j >= 0) {
				if (arr[j] > temp)
					arr[j + 1] = arr[j];
				else
					break;
				j--;
			}
			arr[j + 1] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));

	}

}
