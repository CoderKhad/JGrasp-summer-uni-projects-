
// Method overriding: DogShelter.java
public class DogShelter extends AnimalShelter 
{
	
	public void adopt(Animal animal) 
   {
		System.out.println("Adopting dog: " + animal.toString());
	}
}
