
import java.util.List;
import java.util.ArrayList;

   //Polymorphism: Kennel
    public class Kennel 
    {
      private List<Animal> animals = new ArrayList<>();
      private List<Dog> dogs = new ArrayList<>();

    public void addAnimal(Animal animal) 
      {
        animals.add(animal);
      }

    public List<Animal> getAnimals() 
    {
        return animals;
    }

    //Aggregation: Kennel
    public void addDog(Dog dog) 
    {
        dogs.add(dog);
    }

    public List<Dog> getDogs() 
    {
        return dogs;
    }
}