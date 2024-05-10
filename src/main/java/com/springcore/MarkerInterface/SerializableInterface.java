package com.springcore.MarkerInterface;

import java.io.*;

//A class that implements Serializable interface
class Person implements Serializable {
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

//Main class to demonstrate serialization
public class SerializableInterface {
	public static void main(String[] args) {
		// Create an object of Person class
		Person person = new Person("John", 30);

		// Serialize the object
		try {
			FileOutputStream fileOut = new FileOutputStream("person.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);//object convert into byte stream
			objectOut.writeObject(person);
			objectOut.close();
			fileOut.close();
			System.out.println("Object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try {
			FileInputStream fileIn = new FileInputStream("person.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Person deserializedPerson = (Person) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println("Object deserialized successfully.");
			System.out.println("Name: " + deserializedPerson.getName());
			System.out.println("Age: " + deserializedPerson.getAge());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
