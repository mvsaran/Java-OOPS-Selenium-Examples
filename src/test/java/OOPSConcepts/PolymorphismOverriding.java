package OOPSConcepts;

// Overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

class Car { // Parent class
	void sound() { // Method to be overridden
		System.out.println("Car makes a sound");
	}
}

class Benz extends Car { // Child class that overrides the sound method of Car
	@Override
	void sound() { // Overriding method
		System.out.println("Benz makes a unique sound");
	}
}
public class PolymorphismOverriding {
    public static void main(String[] args) {
		// Creating an instance of the parent class
		Car myCar = new Car();
		myCar.sound(); // Calls the sound method of Car

		// Creating an instance of the child class
		Benz myBenz = new Benz();
		myBenz.sound(); // Calls the overridden sound method of Benz

		// Upcasting: Parent reference to Child object
		Car myUpcastedBenz = new Benz();
		myUpcastedBenz.sound(); // Calls the overridden sound method of Benz
    }
}
