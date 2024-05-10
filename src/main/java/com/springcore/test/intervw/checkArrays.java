package com.springcore.test.intervw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkArrays {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		int[] arr2= {4,5,6,2,6,3};
		List<Integer> list1=new ArrayList<>();
		for(int t:arr) {
			list1.add(t);
		}
		
		int t=0;
		for(int i=0;i<arr2.length;i++) {
			
			if(list1.contains(arr2[i])) {
				t++;
			}
		}
		if(t==arr2.length) System.out.println("true");
		
		char[] arr3= {'d','r'};
		List<Character> list2=Arrays.asList(arr3);

	}

}
