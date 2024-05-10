package com.springcore.OnlyInter2;


class A {
	void m1() {
		System.out.print("im m1 in A");
	}
}
class B extends A{
	void m1() {
		System.out.print("im m1 in B");
	}
	void m2() {
		System.out.print("im m2 in B");
	}
}
public class test {

	public static void main(String[] args) {
		A a=new B();
		//a.m2();// not possible becaz method m2 not available in A
		
		B b=new B();
		b.m2();//im m2 in B
	}
}
