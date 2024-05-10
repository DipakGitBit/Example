package com.springcore.test.intervw;

import java.util.*;

public class stackCheckParathesis {

	public static void main(String[] args) {
		Stack<Character> stack=new Stack<>();
		
		String str="{[a+b]-(a-b)({)]}";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
				stack.push(str.charAt(i));
			}
				if(str.charAt(i)==')' ) {
					if(stack.peek()=='(') {
						stack.pop();
					}
				}
				
				if(str.charAt(i)=='}' ) {
					if(stack.peek()=='{') {
						stack.pop();
					}
				}
				if(str.charAt(i)==']' ) {
					if(stack.peek()=='[') {
						stack.pop();
					}
				}
			}
			
			
		
		System.out.print(stack);
		if(stack.isEmpty()) {
			System.out.println("balanced");
		}else System.out.println("not balanced");
	}
}
		
		

	


