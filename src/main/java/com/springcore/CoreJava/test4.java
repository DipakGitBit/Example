package com.springcore.CoreJava;


import java.awt.FocusTraversalPolicy;
import java.text.NumberFormat;

import java.util.*;
import java.util.Map.Entry;

public class test4 {

	public static void main(String[] args) {
		String[] arr= {"1-english:34","2-english:34","3-hindi:34","3-math:34","5-hindi:34"};
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		Map<String,Integer> count=new LinkedHashMap<String,Integer>();
		for(int i=0;i<arr.length;i++) {
			String[] prr=arr[i].split("-");
			
			String[] rpp=prr[1].split(":");
			map.put(rpp[0],map.containsKey(rpp[0])?map.get(rpp[0])+Integer.parseInt(rpp[1]):Integer.parseInt(rpp[1]));
			count.put(rpp[0],count.containsKey(rpp[0])?count.get(rpp[0])+1:1);
			
		}
		
		//System.out.print(map);
		//System.out.print(count);
		
		for( Entry<String,Integer> entry1:map.entrySet()) {
			for( Entry<String,Integer> entry2:count.entrySet()) {
				
				
				if(entry1.getKey()==entry2.getKey()) {
					System.out.println(entry1.getKey()+" "+entry1.getValue()/entry2.getValue());
				}
			}
			
			
		}
		  
		
		

	}

}
