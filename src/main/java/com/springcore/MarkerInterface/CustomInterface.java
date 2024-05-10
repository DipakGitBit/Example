package com.springcore.MarkerInterface;

//Custom marker interface
interface MyMarker {
	// No methods or fields
}

//Class implementing the marker interface
class MyClass implements MyMarker {
	// Class definition
}

//Another class without implementing the marker interface
class AnotherClass {
	// Class definition
}

//Main class to demonstrate marker interface usage
public class CustomInterface {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		AnotherClass obj2 = new AnotherClass();

		// Check if obj1 implements the marker interface
		if (obj1 instanceof MyMarker) {
			System.out.println("obj1 implements MyMarker interface");
		} else {
			System.out.println("obj1 does not implement MyMarker interface");
		}

		// Check if obj2 implements the marker interface
		if (obj2 instanceof MyMarker) {
			System.out.println("obj2 implements MyMarker interface");
		} else {
			System.out.println("obj2 does not implement MyMarker interface");
		}
	}
}
