package com.springcore.test.intervw;

public class SortedSquareArrayofpositiveNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -6, -1, 0,1, 2, 3, 5 };
		int[] ss = new int[arr.length];
		int stari = 0, endi = arr.length - 1, i = 0;
		while (stari <= endi) {
			if (arr[stari] * arr[stari] >= arr[endi] * arr[endi]) {
				ss[i] = arr[stari] * arr[stari];

				// System.out.println(arr[stari]*arr[stari]);
				stari++;
			} else if (arr[stari] * arr[stari] < arr[endi] * arr[endi]) {
				ss[i] = arr[endi] * arr[endi];
				// System.out.println(arr[endi]*arr[endi]);
				endi--;
			}
			i++;

		}
		for (i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
	}

}
