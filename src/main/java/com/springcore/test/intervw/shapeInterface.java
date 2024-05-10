package com.springcore.test.intervw;

//create a shape interface having methods area() and perimeter(). create 2 subclasses.
//circle and rectangle that implement the shape interface. create a class demo with the 
//main method demonstrate the area and perimeters of both the shape classes

interface shape {
	void area();

	void perimeter();
}

class circle implements shape {
	private static int rad;

	circle(int a) {
		this.rad = a;
	}

	@Override
	public void area() {
		System.out.println("Area is " + Math.PI * Math.pow(rad, 2));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter is " + 2 * Math.PI * rad);

	}
}

class rectangle implements shape {

	private static int len, bred;

	rectangle(int a, int b) { // if constructor is private , is not visible to main class, throw error compile
								// time error
		this.len = a;
		this.bred = b;
	}

	@Override
	public void area() {
		System.out.println("Area is " + len * bred);

	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter is " + 2 * (len + bred));

	}
}

public class shapeInterface {

	public static void main(String[] args) {
		circle c = new circle(3);
		c.area();
		c.perimeter();

		rectangle r = new rectangle(2, 4);
		r.area();
		r.perimeter();

	}

}
