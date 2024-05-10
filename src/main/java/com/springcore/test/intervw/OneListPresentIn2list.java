package com.springcore.test.intervw;

import java.util.List;

public class OneListPresentIn2list {

	public static void main(String[] args) {
		List<Integer> list1=List.of(1,2,3);
		
		List<Integer> list2=List.of(3,4,5,6,7);
		List<Integer> list3=List.of(1,2,3,4,5);
		
		for(Integer i:list1){
			if(list2.contains(i) || list3.contains(i)) {
				System.out.print(i);
			}
			
		}		

	}

}
