package com.springcore.OnlyInter2;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put(null, 1);
		hashMap.put(null, 2);

		System.out.println(hashMap); // Output: {null=2}

		int a = -15, b = -20;
		b = b - a;
		a = a + b;
		b = a - b;

		System.out.println(a + " " + b);

	}

}
