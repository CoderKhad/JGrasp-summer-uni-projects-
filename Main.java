
import java.util.List;
import java.util.ArrayList;

// Main class: Main.java
public class Main 
{
	public static void main(String[] args) 
   {
		// Create objects
		Dog dog = new Dog("Mongrell", 3, "Golden Retriever");
		PetDog petDog = new PetDog("Max", 2, "Labrador");
		AnimalShelter shelter = new AnimalShelter();
		DogShelter dogShelter = new DogShelter();
		Kennel kennel = new Kennel();

		// Test polymorphism
		kennel.addAnimal(dog);
		kennel.addAnimal(petDog);

		// Test method overloading
		shelter.adopt(dog);
		shelter.adopt(petDog);

		// Test method overriding
		dogShelter.adopt(dog);

		// Test static method
		Utility.printMessage();

		// Test aggregation
		kennel.addDog(dog);
		kennel.addDog(petDog);

		// Print results
		System.out.println(kennel.getAnimals());
		System.out.println(kennel.getDogs());
	}
}