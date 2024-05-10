package com.springcore.MarkerInterface;

//A class that implements Cloneable interface
class Rectangle implements Cloneable {
	private int length;
	private int width;

	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// Getters and setters
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// Method to create a shallow copy of the object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

//Main class to demonstrate cloning
public class ClonableInterface {
	public static void main(String[] args) {
		// Create an object of Rectangle class
		Rectangle originalRectangle = new Rectangle(5, 3);

		// Clone the object
		Rectangle clonedRectangle = null;
		try {
			clonedRectangle = (Rectangle) originalRectangle.clone();
			System.out.println("Object cloned successfully.");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Print original and cloned rectangle properties
		if (clonedRectangle != null) {
			System.out.println("Original Rectangle: Length=" + originalRectangle.getLength() + ", Width="
					+ originalRectangle.getWidth());
			System.out.println("Cloned Rectangle: Length=" + clonedRectangle.getLength() + ", Width="
					+ clonedRectangle.getWidth());
		}
	}
}
