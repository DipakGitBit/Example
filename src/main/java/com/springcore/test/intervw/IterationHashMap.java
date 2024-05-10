package com.springcore.test.intervw;
import java.util.*;

import javax.swing.RowFilter.Entry;

public class IterationHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Character> map=new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(5, 'e');
		
		//here all loop print key and value pair
		
		System.out.println();
		for(Integer c:map.keySet()){
			System.out.print(map.get(c));
		}
		System.out.println();
		for(Map.Entry<Integer,Character> entry: map.entrySet()) {
			System.out.print(entry.getKey()+" "+entry.getValue());
		}
		System.out.println();
		map.entrySet().stream().forEach(e->System.out.print(e.getKey()+" "+e.getValue()));
		
		System.out.println();
		map.forEach((key,value)->{
			System.out.print(key+" "+value);
		});
		

	}

}
