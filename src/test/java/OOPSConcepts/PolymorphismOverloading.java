package OOPSConcepts;

/* 👉 What is it?
Same method name, but different arguments within the same class — decided at compile time.*/
public class PolymorphismOverloading {
	
void greet() {
    System.out.println("Hello!");
}

void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

void greet(String name, int age) {
    System.out.println("Hello, " + name + "! You are " + age + " years old.");
}



	public static void main(String[] args) {
		
		// Creating an instance of PolymorphismOverloading
		PolymorphismOverloading obj = new PolymorphismOverloading();

		// Calling the overloaded methods
		obj.greet(); // Calls the first method
		obj.greet("Alice"); // Calls the second method
		obj.greet("Bob", 30); // Calls the third method
	}

}
