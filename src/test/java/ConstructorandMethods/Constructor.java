package ConstructorandMethods;

// ✅ OOPS CONCEPT: CONSTRUCTOR USAGE
// This program demonstrates how to use a constructor to initialize object attributes.

public class Constructor { // ✅ Class declaration

    // ✅ ENCAPSULATION
    // Attributes (fields) are declared inside the class.
    // They are not public — they belong to the object and are only accessible through its methods.
    String name;  // attribute for storing name
    int age;      // attribute for storing age

    // ✅ CONSTRUCTOR
    // This constructor initializes the object’s attributes.
    public Constructor(String name, int age) { 
        this.name = name;  // ✅ 'this' refers to the current object
        this.age = age;
    }

    // ✅ ABSTRACTION
    // This method hides internal representation (attributes) and exposes a simple way to display info.
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // ✅ MAIN METHOD: Entry point to run the program.
    public static void main(String[] args) {
        // ✅ OBJECT CREATION with Constructor
        // Passes "Alice" and 30 to the constructor, which sets name and age.
        Constructor person = new Constructor("Alice", 30);

        // ✅ METHOD CALL
        // Calls the method that displays encapsulated data.
        person.displayInfo();
    }
}
