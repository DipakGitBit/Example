package com.springcore.DSA;

import java.util.Comparator;

interface A{
	int m1();
}
interface B{
	int m1();
}


public class test4 implements A,B{
	public static void main(String[] args) {
		test4 objTest4=new test4();
		objTest4.m1();
	}
	@Override
	public int m1() {
		System.out.print("i am here");
		return 0;
	}
}
