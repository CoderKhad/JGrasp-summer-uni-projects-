
// Method overloading: AnimalShelter.java
public class AnimalShelter 
{
	public void adopt(Animal animal) 
   {
		System.out.println("Adopting animal: " + animal.toString());
	}

	public void adopt(PetDog dog) 
   {
		System.out.println("Adopting dog: " + dog.toString());
	}
}
