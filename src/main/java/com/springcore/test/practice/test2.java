package com.springcore.test.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test2 {

	static int fibonacci(int n) {
		// int a=0,b=1;

		if (n <= 1) {
			return n;
		}
		// System.out.println(fibonacci(n-1)+fibonacci(n-2));
		return fibonacci(n - 1) + fibonacci(n - 2);

		// 0 1 2 3 5 8 13 21 34 55

	}

	static void Intswap(int a, int b) {
		System.out.println(a + " " + b);

		b = b - a;
		a = a + b;
		b = a - b;

		System.out.println(a + " " + b);
		
		
		a = b * a;
		b = b/a;
		a = a / b;

		System.out.println(a + " " + b);
	}

	static int factorial(int n) {
		// int a=0,b=1;

		if (n <= 1) {
			return n;
		}
		// System.out.println(fibonacci(n-1)+fibonacci(n-2));
		return factorial(n - 1) * n;

		// 0 1 2 3 5 8 13 21 34 55

	}

//map sort
	static HashMap<String, Integer> sortByValueMap(HashMap<String, Integer> hm) {

		HashMap<String, Integer> temp = hm.entrySet().stream()
				.sorted((i1, i2) -> i1.getKey().compareTo(i2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		//same as getValue to sort by value
		return temp;

	}

	static void checkBinary(int num) {
		String regex = "[01][01]+";

		// Match the given number with
		// the regular expression
		System.out.print(Integer.toString(num).matches(regex));
	}

	static void armstrong(int num) {
		String s = String.valueOf(num);

		int pow = s.length(), sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = Integer.parseInt(String.valueOf(s.charAt(i)));

			sum = (int) (sum + Math.pow(a, pow));

			// System.out.println(a+" "+sum);

		}
		System.out.println(sum);
	}

	static void floyedTriangle(int num) {
		int t = 1, j = 1;
		for (int i = 1; i <= num && t < num;) {
			j = 1;
			while (j <= i) {
				System.out.print(t + " ");
				j++;
				t++;
			}
			System.out.println();

			i++;
		}

		t = 1;
		j = 1;
		for (int i = 1; i <= num && t < num;) {
			j = 1;
			for (int p = 0; p < num - i; p++) {
				System.out.print(" ");
			}
			while (j <= i) {
				System.out.print(t + " ");
				j++;
				t++;
			}
			System.out.println();

			i++;
		}

	}
	
	static void RotateArrayByNposition() {
		
		int[] arr= {1,2,3,4,5};
		int nPos=2;
		//after rotate its look like 4,5,1,2,3
		
		int[] arr2=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			int newPos=(i+nPos)%arr.length;
			arr2[newPos]=arr[i];
	
		}
		
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}

	public static void main(String[] args) {
		int t = fibonacci(8);
		// System.out.print(t);

		 //Intswap(10,20);

		int g = factorial(5);
		// System.out.print(g);

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating", 79);
		hm.put("Networking", 80);
		Map<String, Integer> hm1 = sortByValueMap(hm);
		 System.out.println(hm1);
		/*
		 * for (Map.Entry<String, Integer> en : hm1.entrySet()) {
		 * System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue()); }
		 */

		// checkBinary(101011);

		// armstrong(153);

		// print without loop
		int[] arr = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(9, 8, 7);
		// list.stream().forEach(s->System.out.print(s+" "));

		// Arrays.stream(arr).forEach(s->System.out.print(s+" "));

		// floyed triangle

		// floyedTriangle(10);

		int f = 4;

		//System.out.print(f == (f / 2) * 2);
		
		
		String str1="java";
		String str2="Java";
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		//System.out.print(Arrays.equals(c1, c2));
		
		RotateArrayByNposition();
		

	}

}
