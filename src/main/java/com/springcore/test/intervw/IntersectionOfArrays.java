package com.springcore.test.intervw;
import java.util.*;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,2,4,7,8,8};
		Set<Integer> set=new HashSet<>();
		//Collections.addAll(set, Arrays.toString(arr1));
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		System.out.print(arr1);
		System.out.print(set);
		
		Set<Integer> inetrsection=new HashSet<>();
		//intersection
		int[] arr2= {1,2,5,6};
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				inetrsection.add(arr2[i]);
			}
		}
		System.out.print(inetrsection);
		
		
		//union
		Set<Integer> union=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			union.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			union.add(arr2[j]);
		}
		
		System.out.print(union);
	}

}
