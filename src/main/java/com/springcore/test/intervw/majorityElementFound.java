package com.springcore.test.intervw;

import java.util.*;
import java.util.stream.Stream;

import javax.swing.RowFilter.Entry;

public class majorityElementFound {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int[] arr = { 1, 2, 3, 4, 3, 2 ,2};
		for (int i : arr) {

			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);

		}
		
		

		System.out.println(map);
		int mx=0;
		//print frequency more or equal 50 % of size
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>=map.size()/2) {
				System.out.println(entry.getKey()+"-"+ entry.getValue());
			}
			//maximum
			if(entry.getValue()>mx) {
				mx=entry.getValue();
			}
		}
		
		
		
		
		System.out.println("heighest frequency : "+ map.get(mx)+"-"+mx);
		
		
		
		
		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		char[] arr1 = { 'a','b','c','a' };
		for (char i : arr1) {

			map1.put(i, map1.containsKey(i) ? map1.get(i) + 1 : 1);

		}

		System.out.print(map1);
		
	}

}
