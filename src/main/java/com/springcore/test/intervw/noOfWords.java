package com.springcore.test.intervw;
import java.util.*;

import java.util.Map.Entry;

public class noOfWords {
	
	static void noOfWords() {
		String str="hello Hello you";
		
		String[] sarr=str.toLowerCase().split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(int i=0;i<sarr.length;i++) {
			map.put(sarr[i], map.containsKey(sarr[i])?map.get(sarr[i])+1:1);
		}
		
		for(Entry<String, Integer> entryset : map.entrySet()) {
			System.out.println(entryset.getKey()+" "+entryset.getValue());
			
		}
		
	}

	public static void main(String[] args) {
		noOfWords();

	}

}
