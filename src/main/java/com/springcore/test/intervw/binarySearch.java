package com.springcore.test.intervw;

public class binarySearch {

	private static int binSerch(int[] arr, int low, int high, int searchElement) {
		if (high >= low) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == searchElement) {
				return mid;
			}
			if (searchElement > arr[mid]) {
				return binSerch(arr, mid + 1, high, searchElement);
			} else if (searchElement < arr[mid]) {
				return binSerch(arr, low, mid - 1, searchElement);
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int searchElement = 40;
		int index = binSerch(arr, 0, arr.length - 1, searchElement);
		System.out.print(index);
	}

}
