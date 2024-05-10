package com.springcore.test.intervw;

import java.util.Arrays;

public class SqaureEachNumber {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int[] squaredNumbers = Arrays.stream(numbers).map(n->n*n).toArray();
		// squaredNumbers will be [1, 4, 9]
		
		for(int i:squaredNumbers)
		System.out.println(i);


	}

}
