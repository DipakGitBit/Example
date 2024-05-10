package com.springcore.test.intervw;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class runtimepoly {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound(); // Output: Dog barks
        animal2.sound(); // Output: Cat meows
    }
}
