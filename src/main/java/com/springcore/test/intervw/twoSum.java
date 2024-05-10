package com.springcore.test.intervw;

//two sum -find pair with given sum in array
//{10,20,30,40,50},givensum=50
public class twoSum {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 50, i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + "-" + arr[j]);

				}
			}
		}

	}

}
