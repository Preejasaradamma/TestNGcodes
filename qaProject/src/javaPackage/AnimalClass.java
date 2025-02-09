package javaPackage;

public class AnimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
			// Create objects of different subclasses
	        Animal myAnimal = new Animal();   // Animal reference, Animal object
	        Animal myDog = new Dog();         // Animal reference, Dog object
	        Animal myCat = new Cat();         // Animal reference, Cat object

	        // Call sound method (run-time polymorphism)
	        myAnimal.sound();  // Calls Animal's sound method
	        myDog.sound();     // Calls Dog's overridden sound method
	        myCat.sound();     // Calls Cat's overridden sound method

		}

	}


	//Parent class
	class Animal {
	 // Method to be overridden
	 public void sound() {
	     System.out.println("Animal makes a sound");
	 }
	}

	//Subclass Dog overriding sound method
	class Dog extends Animal {
	 @Override
	 public void sound() {
	     System.out.println("Dog barks");
	 }
	}

	//Subclass Cat overriding sound method
	class Cat extends Animal {
	 @Override
	 public void sound() {
	     System.out.println("Cat meows");
	 }
}

