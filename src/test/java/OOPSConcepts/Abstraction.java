package OOPSConcepts;

// Absstraction is a way to provide a simple interface while hiding the complex implementation details.
// It allows us to define abstract classes and methods that can be implemented by subclasses.
// In Java, abstraction can be achieved using abstract classes and interfaces.
// An abstract class can have both abstract methods (without body) and concrete methods (with body).
// An abstract method must be implemented by any non-abstract subclass.
// Example of abstraction using an abstract class:

abstract class Shape { // Abstract class
    abstract void draw(); // Abstract method, no body
}

class Circle extends Shape { // Concrete class that extends the abstract class Shape
    void draw() { // Implementation of the abstract method
        System.out.println("Drawing Circle");
    }
}

public class Abstraction { // Main class to demonstrate abstraction
	// In this example, we have an abstract class Shape with an abstract method draw().
	// The Circle class extends Shape and provides an implementation for the draw() method.
	// We can create an instance of Circle and call the draw() method, which will
	// print "Drawing Circle".

	public static void main(String[] args) { // Main method to run the example
        Shape s = new Circle(); // Create an instance of Circle, which is a concrete class that implements the abstract method
        s.draw(); // Call the draw() method on the Shape reference, which points to a Circle object
    }
	
}
