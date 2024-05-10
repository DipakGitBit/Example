package com.springcore.DSA;

import java.util.Arrays;

public class MergeSort {
	static void Merge(int arr[], int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];
		int l1 = si, l2 = mid + 1, x = 0;

		while (l1 <= mid && l2 <= ei) {
			if (arr[l1] <= arr[l2])
				merged[x++] = arr[l1++];
			else
				merged[x++] = arr[l2++];
		}

		while (l1 <= mid)
			merged[x++] = arr[l1++];

		while (l2 <= ei)
			merged[x++] = arr[l2++];

		System.out.println(merged.length+" "+arr.length);
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
		System.out.println(Arrays.toString(merged)+" "+Arrays.toString(arr));
	}

	static void Divide(int[] arr, int si, int ei) {
		if (si >= ei)
			return;

		int mid = (si + ei) / 2;

		Divide(arr, si, mid);
		Divide(arr, mid + 1, ei);
		Merge(arr, si, mid, ei);
	}
	public static void main(String[] args) {
		int[] arr = { 3, 0, 4, 1 };

		Divide(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}

}
