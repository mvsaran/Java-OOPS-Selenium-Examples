package OOPSConcepts;

/**
 * Encapsulation is a fundamental concept in object-oriented programming that
 * restricts direct access to an object's data and methods. 
 * It allows for controlled access through public methods, ensuring that the internal state of an object can only be modified in a safe manner.
 *  This promotes data hiding and abstraction, making the code more maintainable and secure.
 */

class Employee { // encapsulated class
	
    private String name; // private variable

    public void setName(String name) { // setter
        this.name = name; // assign value to the private variable
    }

    public String getName() { // getter
        return name; // return the value of the private variable
    }
}

public class Encapsulation { // main class to demonstrate encapsulation

	public static void main(String[] args) { //
		// Creating an instance of Employee and using encapsulation to set and get the
		// name
		System.out.println("Encapsulation Example:");
		
		Employee emp = new Employee(); // creating an object of Employee class
        emp.setName("Alice"); // setting the name using setter method
        System.out.println(emp.getName()); // getting the name using getter method

	}

}
