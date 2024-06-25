
//Subclass: Dog
public class Dog extends Animal 
{
	// Data members
	private String breed;

	// Accessor and mutator methods
	public String getBreed() 
   {
		return breed;
	}

	public void setBreed(String breed) 
   {
		this.breed = breed;
	}

	// Constructor
	public Dog(String name, int age, String breed) 
   {
		super(name, age); 
      // Call superclass constructor
		this.breed = breed;
	}

	// toString method
	@Override
	public String toString() 
   {
		return "Dog [breed=" + breed + ", name=" + getName() + ", age=" + getAge() + "]";
	}
}