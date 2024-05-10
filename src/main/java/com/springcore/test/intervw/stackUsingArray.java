package com.springcore.test.intervw;


//stack using array.
public class stackUsingArray {
	static int[] arr1 = new int[6];
	static int top = 0;

	static void pop() {
		if (top == 0) {
			System.out.println("stack underflow");

		} else {
			int t = arr1[--top];
			System.out.println("stack removed " + t);

		}
	}

	static void push(int x) {
		if (top < arr1.length) {

			arr1[top++] = x;
			System.out.println("stack inserted : " + x + " " + top);
		} else {
			System.out.println("stack overflow");
		}

	}

	public static void main(String[] args) {

		push(3);
		push(3);
		push(3);
		push(3);
		push(3);
		push(3);
		push(3);
		push(3);
		push(3);

		pop();
		push(3);
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		push(3);
		push(3);
		push(3);
		push(3);

	}

}
