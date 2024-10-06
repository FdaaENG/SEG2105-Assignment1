
public class Dog extends Mammal{
	
	public Dog() {
		super();
		System.out.println("Dog Constructor called");
	}
	
	public Dog(String name) {
		super(name);
		System.out.println("Dog Constructure with name called");
	}
	
	public void makeSound() {
		System.out.println("Woof!");
	}
	
	public String getAnimalType() {
		return "Dog";
	}
}
