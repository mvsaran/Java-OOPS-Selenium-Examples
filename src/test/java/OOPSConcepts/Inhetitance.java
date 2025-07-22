package OOPSConcepts;

// Example of Inheritance in Java
// Inheritance allows a class to inherit fields and methods from another class.
// In this example, Dog class inherits from Animal class.
// The Dog class can use methods defined in the Animal class, demonstrating code reuse.
// The Dog class can also have its own methods, like bark().
// This is a simple example to illustrate the concept of inheritance in Java.
// Inheritance is a key feature of object-oriented programming that promotes code reuse and establishes a relationship between classes.
// Inheritance is a mechanism where a new class can inherit the properties and behaviors (methods) of an existing class, allowing for code reuse and establishing a hierarchical relationship between classes.
// Inheritance is a fundamental concept in object-oriented programming that allows one class to inherit the properties and behaviors of another class.


class Animal { // Base class
    void eat() { // Method in base class
        System.out.println("Eating...Parent Class");// Method to demonstrate behavior of the base class
    }
}

class Dog extends Animal { // Derived class inheriting from Animal
    void bark() {	 // Method specific to Dog class
        System.out.println("Barking...Child Class"); // Method to demonstrate behavior of the derived class
    }
}

public class Inhetitance { // Main class to demonstrate inheritance
	// The main method is the entry point of the program.
	// It creates an instance of Dog and calls its methods to show inherited
	// behavior.
	// The Dog instance can call both eat() from Animal and bark() from Dog.
	
	public static void main(String[] args) { // Main method to run the program
        Dog d = new Dog(); // Create an instance of Dog, which is a subclass of Animal
        d.eat(); // Call the inherited method from Animal class
        d.bark(); // Call the method specific to Dog class
    }

}
