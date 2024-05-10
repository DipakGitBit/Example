package com.springcore.test.intervw;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class arrayOp {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,8};
		
		OptionalInt c=Arrays.stream(arr).max();
		int d=Arrays.stream(arr).sum();
		System.out.println(c);
		System.out.println(d);
		
		int s1=IntStream.of(arr).sum();
		System.out.println(s1);
		
		int s2=Arrays.stream(arr).reduce((x, y)->x+y).getAsInt();
		System.out.println(s2);

	}

}
