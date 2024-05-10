package com.springcore.OnlyInter2;

import java.util.Arrays;

public class FindDistinct {

	public static void main(String[] args) {
		String[] array = { "apple", "banana", "apple", "orange", "banana", "apple" };
		String[] uniqueArray = Arrays.stream(array).distinct().toArray(String[]::new);
		System.out.println(Arrays.toString(uniqueArray));
		
		int[] array2 = { 1,2,1,1,4,5,6,7,7,8,9,9 };
		Arrays.stream(array2).distinct().forEach(System.out::print);

		

	}

}
