package com.springcore.DSA;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 99, -6, 1, 4, 5 };

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] < arr[j]) {
					smallest = j;

				}
			}
			int t = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = t;

		}

		System.out.println(Arrays.toString(arr));

	}

}
