package com.springcore.MarkerInterface;

@FunctionalInterface
interface MyFunction {
	void performAction(String input);
}

public class CustomFunctionalInterface {
	public static void main(String[] args) {
		// Using a lambda expression
		MyFunction action = input -> System.out.println("Performing action with input: " + input);
		action.performAction("Hello");

		// Using a method reference
		MyFunction action2 = CustomFunctionalInterface::performAction;
		action2.performAction("World");
	}

	public static void performAction(String input) {
		System.out.println("Performing action with input: " + input);
	}
}
