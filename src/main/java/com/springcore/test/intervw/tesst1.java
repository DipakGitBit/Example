package com.springcore.test.intervw;

import java.io.IOException;

class A {
	void m1() throws ArrayIndexOutOfBoundsException  {
		System.out.print("In m1 A");
	}
}
class B extends A  {
	void m1() throws NumberFormatException  {
		System.out.print("In m1 B");
	}
}
public class tesst1 {

	public static void main(String[] args) {
		//A a = new B();
		//a.m1();//In m1 B

		A a = new B();
		
		
		 try { a.m1(); } catch (Exception e) { e.printStackTrace(); }
		 
	}
}
