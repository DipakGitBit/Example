package com.springcore.test.intervw;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 11, 5, 4, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " - ");
			int max = arr[i];
			for (int j = i + 1; j < arr.length; j++) {

				if (max < arr[j]) {
					max = arr[j];

				}
			}
			if (max == arr[i]) {
				System.out.println(-1);
			} else
				System.out.println(max);

		}

	}

}
