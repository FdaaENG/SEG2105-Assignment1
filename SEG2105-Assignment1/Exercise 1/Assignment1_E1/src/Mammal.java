
public class Mammal extends Animal{
	
	static int numberOfMammals;
	
	public Mammal() {
		super();
		numberOfMammals++;
		System.out.println("Mammal Constructor called");
		
	}
	
	public Mammal(String name) {
		super(name);
		numberOfMammals++;
		System.out.println("Mammal Constructor with name called");
		
	}
	
	public void makeSound() {
		System.out.println("Mammal sound");
	}
	
	public String getAnimalType() {
		return "Mammal";
	}
	public static int getNumberOfMammals() {
		return numberOfMammals;
	}
}
